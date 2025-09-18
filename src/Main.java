import pkg1.Food;
import pkg1.Recipes;
import pkg1.methodsFoodRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        List<Food> foods = new ArrayList<>();
        List<Recipes> recipes = new ArrayList<>();
        // Main loop
        while (option != 2) {
            System.out.println("1. Food and Recipes " +
                    "\n2. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    int option1 = 0;
                    System.out.println("1. Add food" +
                            "\n2. Check food list" +
                            "\n3. Add recipe" +
                            "\n4. Check recipe list");
                    option1 = sc.nextInt();
                    methodsFoodRecipe mt = new methodsFoodRecipe(sc);
                    switch (option1) {
                        case 1:
                            Food newFood = mt.addFood();
                            foods.add(newFood);
                            break;
                        case 2:
                            if (foods.isEmpty()) {
                                System.out.println("There is no food to show");
                            } else {
                                for (Food food : foods) {
                                    food.showFood();
                                    System.out.println("-------------------");
                                }
                            }
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.println("Enter recipe name: ");
                            String recipeName = sc.nextLine();
                            Recipes recipe = new Recipes(recipeName);
                            recipe.addRecipe(foods, sc);
                            recipes.add(recipe);
                            break;
                        case 4:
                            if (recipes.isEmpty()) {
                                System.out.println("There is no recipes to show");
                            } else {
                                for (Recipes recip : recipes) {
                                    recip.showRecipe();
                                    System.out.println("-------------------");
                                }

                            }
                            break;
                    }
            }
        }
        sc.close();
    }
}