package creation.builder;

/**
 * 食物条目接口
 * @author zhangyaqi
 * @since JDK1.8
 */
public interface Item {
    /**
     * 获取食物名称
     * @return 食物名称
     */
    String name();

    /**
     * 对食物进行包装
     * @return 包装类型
     */
    Packing packing();

    /**
     * 获取食物价格
     * @return 食物价格
     */
    float price();
}
