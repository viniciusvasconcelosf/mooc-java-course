import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }

    public void readRecipes(String fileName) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(fileScanner.nextLine());
                Recipe recipe = new Recipe(name, cookingTime);

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }

                this.recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }

    public void listRecipes() {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void findByName(String searched) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(searched)) {
                System.out.println(recipe);
            }
        }
    }

    public void findByCookingTime(int maxTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.hasIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}