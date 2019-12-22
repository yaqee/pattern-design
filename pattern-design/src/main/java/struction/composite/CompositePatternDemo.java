package struction.composite;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("John", "CEO", 20000);
        Employee headSales = new Employee("Robert", "Head Sales", 2000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 2000);
        Employee saleExecutive1 = new Employee("Richard", "Sales", 1000);
        Employee saleExecutive2 = new Employee("Rob", "Sales", 1000);
        Employee clerk1 = new Employee("Laura", "Marketing", 1000);
        Employee clerk2 = new Employee("Rob", "Marketing", 1000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(saleExecutive1);
        headSales.add(saleExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(ceo);
        for(Employee head: ceo.getSubordinates()) {
            System.out.println(head);
            for(Employee employee: head.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }
}
