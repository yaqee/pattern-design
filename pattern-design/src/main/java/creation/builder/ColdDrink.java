package creation.builder;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public abstract class ColdDrink implements Item{


    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
