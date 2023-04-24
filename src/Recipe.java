public class Recipe {
    private String name;
    private Ingredient[] ingredients;
    private String[] instructions;

    public Recipe(String name, Ingredient[] ingredients, String[] instructions){
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

    }
}
