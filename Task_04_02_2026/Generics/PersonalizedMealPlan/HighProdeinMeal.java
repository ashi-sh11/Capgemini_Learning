package Task_04_02_2026.Generics.PersonalizedMealPlan;

class HighProteinMeal implements MealPlan {
    public String getMealName() {
        return "High-Protein Meal";
    }
    public boolean isValid() {
        return true;
    }
}
