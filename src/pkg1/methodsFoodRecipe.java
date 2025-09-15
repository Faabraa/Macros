package pkg1;

import java.util.Scanner;

/**
 * Provides methods to manage Food and Recipe objects,
 * including creating new Food instances from user input
 */
public class methodsFoodRecipe {
    private Scanner sc;

    /**
     * Constructor with Scanner
     * @param sc Scanner object used for reading user input
     */
    public methodsFoodRecipe(Scanner sc) {
        this.sc = sc;
    }

    /**
     * Reads food information from the user and creates a Food object
     * @return a new Food instance with the provided data
     */
    public Food addFood() {
        System.out.print("Enter food name: ");
        String name = sc.nextLine();
        System.out.print("Enter calories for 100g: ");
        int calories = sc.nextInt();
        System.out.print("Enter fat for 100g: ");
        int fat = sc.nextInt();
        System.out.print("Enter carbohydrates for 100g: ");
        int carbs = sc.nextInt();
        System.out.print("Enter protein for 100g: ");
        int protein = sc.nextInt();
        sc.nextLine();
        return new Food(name, calories, fat, carbs, protein);
    }
}