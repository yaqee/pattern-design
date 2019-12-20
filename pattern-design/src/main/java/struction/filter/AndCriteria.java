package struction.filter;

import java.util.List;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> criteriaPersonList = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersonList = otherCriteria.meetCriteria(criteriaPersonList);
        return otherCriteriaPersonList;
    }
}
