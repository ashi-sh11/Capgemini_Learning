package Task_04_02_2026.Generics.PersonalizedMealPlan;

class Meal<T extends MealPlan> {
    private T mealPlan;
    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }
    public T getMealPlan() {
        return mealPlan;
    }
}
