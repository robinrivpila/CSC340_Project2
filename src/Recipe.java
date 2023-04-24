import java.lang.reflect.Array;
import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> instructions;

    public Recipe(String name, ArrayList<Ingredient> ingredients, ArrayList<String> instructions){
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    String getName(){

        return name;
    }

    void viewIngredients(){
        for(Ingredient ingredient: ingredients){
            ingredient.viewIngredientInfo();
        }
    }

    void viewInstructions(){
        for(int i = 0; i < instructions.size(); i++){
            System.out.println("Step " + (i+1) + ": " + instructions.get(i));
        }
    }
}
