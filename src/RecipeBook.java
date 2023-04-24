import java.util.ArrayList;

public class RecipeBook {
    private ArrayList<Recipe> recipes = new ArrayList<Recipe>();

    public RecipeBook(ArrayList<Recipe> recipes){
        this.recipes = recipes;
    }

    void viewRecipes(){
        for(int i = 0 ; i < recipes.size(); i++){
            System.out.println("Recipe " + (i+1) + ": " + recipes.get(i).getName());
        }
    }
}
