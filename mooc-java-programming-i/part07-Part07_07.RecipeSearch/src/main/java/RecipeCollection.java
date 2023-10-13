
import java.util.ArrayList;

public class RecipeCollection {

    private ArrayList<Recipe> recipeCollection;

    public RecipeCollection() {
        recipeCollection = new ArrayList();
    }

    public void add(Recipe recipe) {
        recipeCollection.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipeCollection;
    }

    public ArrayList<Recipe> searchByRecipeName(String name) {
        ArrayList<Recipe> searchResults = new ArrayList();
        for (Recipe recipe : recipeCollection) {
            if (recipe.getName().contains(name)) {
                searchResults.add(recipe);
            }
        }
        return searchResults;
    }

    public ArrayList<Recipe> searchByCookingTime(int minutes) {
        ArrayList<Recipe> searchResults = new ArrayList();
        for (Recipe recipe : recipeCollection) {
            if (recipe.getCookingTime() <= minutes) {
                searchResults.add(recipe);
            }
        }
        return searchResults;
    }

    public ArrayList<Recipe> searchByIngredient(String name) {
        ArrayList<Recipe> searchResults = new ArrayList();
        for (Recipe recipe : recipeCollection) {
            ArrayList<String> ingredients = recipe.getIngredients();
            if (ingredients.contains(name)) {
                searchResults.add(recipe);
            }
        }
        return searchResults;
    }

    @Override
    public String toString() {
        String output = "";
        for (Recipe recipe : recipeCollection) {
            output += recipe.toString() + "\n";
        }
        return output; //To change body of generated methods, choose Tools | Templates.
    }

}
