package week_5.class_activity3a.model;

import week_5.class_activity3a.enums.MealType;

public class Cafeteria {

    public MealType mealType;


    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }
}
