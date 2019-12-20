package struction.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singleList = new ArrayList<>();
        for (Person person: persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singleList.add(person);
            }
        }
        return singleList;
    }
}
