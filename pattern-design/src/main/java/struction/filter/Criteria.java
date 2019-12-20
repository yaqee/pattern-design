package struction.filter;

import java.util.List;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
