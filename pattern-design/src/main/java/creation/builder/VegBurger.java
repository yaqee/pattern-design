package creation.builder;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
