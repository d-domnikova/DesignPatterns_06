package Part5.T10_FormTemplateMethod;

public abstract class CookingRecipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }
    private void boilWater() {
        System.out.println("Boiling water");
    }
    public abstract void addIngredients();
    public abstract void cook();
    private void serve() {
        System.out.println("Serving");
    }
}