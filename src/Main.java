import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        String instr1 = "cut banana";
        String instr2 = "measure 2 cups of milk";
        String instr3 = "put into a blender";
        ArrayList<String> instructions = new ArrayList<String>();
        instructions.add(instr1);
        instructions.add(instr2);
        instructions.add(instr3);

        Ingredient ingredient1 = new Ingredient("Banana", 2, "slices");
        //ingredient1.viewIngredientInfo();

        Ingredient ingredient2 = new Ingredient("Milk", 2, "cups");
       ingredients.add(ingredient1);
       ingredients.add(ingredient2);
        Recipe bananaMilk = new Recipe("Banana Milk", ingredients, instructions);
        ArrayList<Recipe> recipes = new ArrayList<Recipe>();
        recipes.add(bananaMilk);
        RecipeBook recipeBook1 = new RecipeBook(recipes);
        recipeBook1.viewRecipes();
        bananaMilk.viewInstructions();
    }
}