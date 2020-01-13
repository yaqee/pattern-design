package behavior.template;

public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start Playing.");
    }

    @Override
    public void start() {
        System.out.println("Cricket Game Started.Enjoy the Game!");
    }

    @Override
    public void end() {
        System.out.println("Cricket Game Finished!");
    }
}
