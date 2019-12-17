package creation.builder;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
