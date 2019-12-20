package struction.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person p: persons) {
            if(p.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(p);
            }
        }
        return femalePersons;
    }
}
