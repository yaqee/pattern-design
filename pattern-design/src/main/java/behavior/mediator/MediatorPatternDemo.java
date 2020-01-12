package behavior.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User user1 = new User("Robert");
        User user2 = new User("John");

        user1.sendMessage("Hi!John");
        user2.sendMessage("Hi!Robert");
    }
}
