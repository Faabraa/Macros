package pkg1;

/**
 * The Food class represents a food item with its name and main macronutrients.
 * It stores calories, fat, carbohydrates, and protein, and provides methods
 * to access, modify, and display this nutritional information.
 */
public class Food {
    private String name;
    private int calories;
    private int fat;
    private int carbohydrates;
    private int protein;

    /**
     * Constructor with name and macronutrients
     * @param name
     * @param calories
     * @param fat
     * @param carbohydrates
     * @param protein
     */
    public Food(String name,int calories, int fat, int carbohydrates, int protein) {
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }
    // Getters and setters
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

    /**
     * Displays the food's nutritional information (macronutrients and calories)
     * in a user-friendly format.
     */
    public void showFood() {
        System.out.println("** "+ name + " **" +
                "\nCalories = " + calories +
                "\nFat = " + fat +
                "\nCarbohydrates = " + carbohydrates +
                "\nProtein = " + protein );
    }
}