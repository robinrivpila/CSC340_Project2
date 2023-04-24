public class Ingredient {
    private String name;
    private float amount;
    private String units;

    public Ingredient(String name, float amount, String units){
        this.name = name;
        this.amount = amount;
        this.units = units;
    }

    String getName(){
        return name;
    }

    float getAmount(){
        return amount;
    }

    String getUnits(){
        return units;
    }

    void viewIngredientInfo(){
        System.out.println("\nName: " + name +
                            "\nQuantity: " + amount + " " +units);
    }
}
