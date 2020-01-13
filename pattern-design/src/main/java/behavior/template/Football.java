package behavior.template;

public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start Playing.");
    }

    @Override
    public void start() {
        System.out.println("Football Game Started.Enjoy the Game!");
    }

    @Override
    public void end() {
        System.out.println("Football Game Finished!");
    }
}
