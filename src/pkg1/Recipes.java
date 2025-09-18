package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recipes {
    private List<Food> foodList;
    private String name;

    /**
     * Constructor with name
     * @param name
     */
    public Recipes(String name) {
        this.foodList = new ArrayList<>();
        this.name = name;
    }

    /**
     * Constructor
     */
    public Recipes() {
        this.foodList = new ArrayList<>();
    }

    /**
     * Adds food to recipe
     * @param food
     */
    public void addFoodToRecipe(Food food) {
        foodList.add(food);
    }
    //Calculates total of each macronutrient

    public int getTotalCalories() {
        int total = 0;
        for (Food food : foodList) {
            total += food.getCalories();
        }
        return total;
    }

    public int getTotalFat() {
        int total = 0;
        for (Food food : foodList) {
            total += food.getFat();
        }
        return total;
    }

    public int getTotalCarbohydrates() {
        int total = 0;
        for (Food food : foodList) {
            total += food.getCarbohydrates();
        }
        return total;
    }

    public int getTotalProtein() {
        int total = 0;
        for (Food food : foodList) {
            total += food.getProtein();
        }
        return total;
    }

    public void showRecipe() {
        System.out.println("*** " + name + " ***");
        for (Food food : foodList) {
            food.showFood();
            System.out.println("-------------------");
        }
        System.out.println("Total Calories = " + getTotalCalories());
        System.out.println("Total Fat = " + getTotalFat());
        System.out.println("Total Carbohydrates = " + getTotalCarbohydrates());
        System.out.println("Total Protein = " + getTotalProtein());
    }

    public void addRecipe(List<Food> foods, Scanner sc) {
        System.out.println("Select foods by index (comma separated, e.g. 0,2,3): ");
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(i + ". " + foods.get(i).getName());
        }
        String input = sc.nextLine();
        String[] parts = input.split(",");
        for (String p : parts) {
            try {
                int index = Integer.parseInt(p.trim());
                if (index >= 0 && index < foods.size()) {
                    this.addFoodToRecipe(foods.get(index));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid index: " + p);
            }
        }
    }
}
