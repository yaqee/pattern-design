package struction.filter;

import java.util.List;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstPersonList = criteria.meetCriteria(persons);
        List<Person> secondPersonList = otherCriteria.meetCriteria(persons);

        for(Person p: secondPersonList) {
            if(!firstPersonList.contains(p)) {
                firstPersonList.add(p);
            }
        }
        return firstPersonList;
    }
}
