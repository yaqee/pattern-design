package behavior.template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println("Change Game!");
        game = new Football();
        game.play();
    }
}
