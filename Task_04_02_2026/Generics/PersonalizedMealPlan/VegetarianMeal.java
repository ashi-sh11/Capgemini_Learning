package Task_04_02_2026.Generics.PersonalizedMealPlan;

class VegetarianMeal implements MealPlan {

    public String getMealName() {
        return "Vegetarian Meal";
    }

    public boolean isValid() {
        return true; // vegetarian rules satisfied
    }
}
