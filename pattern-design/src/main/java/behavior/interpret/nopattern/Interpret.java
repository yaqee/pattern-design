package behavior.interpret.nopattern;

public class Interpret {

    public static void main(String[] args) {
        String person1 = "John";
        System.out.println("John is male? " + male(person1));
        System.out.println("Julie is a married woman? " +marriedWomen("Julie Married") );

        String person2 = "Mike";
        System.out.println("Mike is male? " + male(person2));

    }

    public static boolean male(String context) {
        if(context.contains("John") || context.contains("Robert")) {
            return true;
        }
        return false;
    }

    public static boolean marriedWomen(String context) {
        if(context.contains("Julie") && context.contains("Married")) {
            return true;
        }
        return false;
    }
}
