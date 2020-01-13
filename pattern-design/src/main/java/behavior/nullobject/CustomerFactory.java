package behavior.nullobject;

public class CustomerFactory {
    public static String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for(String s: names) {
            if(s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }
}
