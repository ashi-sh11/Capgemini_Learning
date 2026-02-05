package Task_04_02_2026.Generics.PersonalizedMealPlan;

class VeganMeal implements MealPlan {
    public String getMealName() {
        return "Vegan Meal";
    }
    public boolean isValid() {
        return true;
    }
}
