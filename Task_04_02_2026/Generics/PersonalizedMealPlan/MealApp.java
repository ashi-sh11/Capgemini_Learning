package Task_04_02_2026.Generics.PersonalizedMealPlan;

public class MealApp {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());
        MealGenerator.generateMealPlan(vegMeal.getMealPlan());
        MealGenerator.generateMealPlan(veganMeal.getMealPlan());
        MealGenerator.generateMealPlan(ketoMeal.getMealPlan());
    }
}
