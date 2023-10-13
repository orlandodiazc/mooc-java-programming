
import java.nio.file.Paths;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeCollection recipes = new RecipeCollection();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {

                String recipeName = fileScan.nextLine();
                int cookingTime = Integer.valueOf(fileScan.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipes.add(recipe);

                while (fileScan.hasNextLine()) {
                    String ingredient = fileScan.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        UserInterface UI = new UserInterface(scanner, recipes);
        UI.start();
    }
}
