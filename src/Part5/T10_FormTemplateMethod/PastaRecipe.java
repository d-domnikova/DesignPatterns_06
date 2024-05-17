package Part5.T10_FormTemplateMethod;

public class PastaRecipe extends CookingRecipe {
    @Override
    public void addIngredients() {
        System.out.println("Adding pasta");
    }
    @Override
    public void cook() {
        System.out.println("Cooking pasta");
    }
}