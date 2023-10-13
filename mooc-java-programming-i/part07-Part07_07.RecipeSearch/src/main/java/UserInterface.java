
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeCollection recipes;

    public UserInterface(Scanner scanner, RecipeCollection recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println();

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.print(recipes.toString());
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String q = scanner.nextLine();
                ArrayList<Recipe> results = recipes.searchByRecipeName(q);
                printRecipes(results);
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int minutes = Integer.valueOf(scanner.nextLine());
                ArrayList<Recipe> results = recipes.searchByCookingTime(minutes);
                printRecipes(results);
            }

            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                ArrayList<Recipe> results = recipes.searchByIngredient(ingredient);
                printRecipes(results);
            }
        }
    }

    private static void printRecipes(ArrayList<Recipe> list) {
        for (Recipe recipe : list) {
            System.out.println(recipe.toString());
        }
    }
}
