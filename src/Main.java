import pkg1.Food;
import pkg1.methodsFoodRecipe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        Food f = null;
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
                            f = mt.addFood();
                            break;
                        case 2:
                            if (f == null) {
                                System.out.println("There is no food to show");
                            } else {
                                f.showFood();
                            }
                            break;
                    }
            }
        }
        sc.close();
    }
}