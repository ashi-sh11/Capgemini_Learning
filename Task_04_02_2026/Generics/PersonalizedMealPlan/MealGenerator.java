package Task_04_02_2026.Generics.PersonalizedMealPlan;

public class MealGenerator {
    public static <T extends MealPlan>T generateMealPlan(T meal){
        if (meal.isValid()) {
            System.out.println("Meal Generated: " + meal.getMealName());
            return meal;
        } else {
            throw new IllegalArgumentException("Invalid meal plan");
        }
    }
}
