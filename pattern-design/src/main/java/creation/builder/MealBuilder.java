package creation.builder;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        System.out.println("-----------生成蔬菜套餐-------------");
        Meal meal = new Meal();
        ColdDrink coke = new Coke();
        Burger vegBurger = new VegBurger();
        meal.addItem(coke);
        meal.addItem(vegBurger);
        return meal;
    }

    public Meal prepareChickenMeal() {
        System.out.println("-----------生成鸡肉套餐-------------");
        Meal meal = new Meal();
        ColdDrink pepsi = new Pepsi();
        Burger chickenBurger = new ChickenBurger();
        meal.addItem(pepsi);
        meal.addItem(chickenBurger);
        return meal;
    }
}
