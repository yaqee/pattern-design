package creation.builder;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public abstract class Burger implements Item{
    public Packing packing(){
        return new Wrapper();
    }
    public abstract float price();
}
