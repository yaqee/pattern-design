package creation.builder;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();

        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        chickenMeal.showItems();
        StringBuilder sb = new StringBuilder();
    }
}
