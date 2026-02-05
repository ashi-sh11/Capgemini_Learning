package Task_04_02_2026.Generics.PersonalizedMealPlan;

class KetoMeal implements MealPlan {
    public String getMealName() {
        return "Keto Meal";
    }
    public boolean isValid() {
        return true;
    }
}
