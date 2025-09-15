package pkg1;

import java.util.Scanner;

public class Food {
    private String name;
    private int calories;
    private int fat;
    private int carbohydrates;
    private int protein;

    public Food(String name,int calories, int fat, int carbohydrates, int protein) {
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void showFood() {
        System.out.println("name= "+ name +
                " \ncalories= " + calories +
                ", fat= " + fat +
                ", carbohydrates= " + carbohydrates +
                ", protein= " + protein );
    }
}