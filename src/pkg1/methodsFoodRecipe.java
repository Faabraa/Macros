package pkg1;

import java.util.Scanner;

public class methodsFoodRecipe {
    public methodsFoodRecipe() {
    }

    public Food addFood()   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type food name");
        String name = sc.nextLine();
        System.out.println("Type calories for 100g");
        int calories = sc.nextInt();
        System.out.println("Type fat for 100g");
        int fat = sc.nextInt();
        System.out.println("Type carbohydrates for 100g");
        int carbs = sc.nextInt();
        System.out.println("Type protein for 100g");
        int protein = sc.nextInt();
        return new Food(name,calories,fat,carbs,protein);
    }
}
