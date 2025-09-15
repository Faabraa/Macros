import pkg1.Food;
import pkg1.methodsFoodRecipe;

public class Main {
    public static void main(String[] args) {
        methodsFoodRecipe mt = new methodsFoodRecipe();
        Food f = mt.addFood();
        f.showFood();
    }
}