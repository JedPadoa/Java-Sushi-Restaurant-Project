package a4jedi;


abstract public class IngredientPortionImpl implements IngredientPortion {
	
    Ingredient ing;
    double amount;
	
	public IngredientPortionImpl(Ingredient ing, double amount) {
		this.ing = ing;
		this.amount = amount;
		
		if (ing == null) {
			throw new RuntimeException("Ingredient cannot be null");
		}
		
		if (amount < 0.0) {
			throw new RuntimeException("Amount cannot be negative");
		}
	}
	
	public Ingredient getIngredient() {
		return ing;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getName() {
		return ing.getName();
	}
	
	public boolean getIsVegetarian() {
		return ing.getIsVegetarian();
	}
	
	public int getCalories() {
		return (int) (Math.round(ing.getCaloriesPerOunce() * amount));
	}
	
	public double getCost() {
		return ing.getPricePerOunce() * amount;
	}
	
	public boolean getIsRice() {
		return ing.getIsRice();
	}
	
	public boolean getIsShellfish() {
		return ing.getIsShellfish();
	}
	
	abstract public IngredientPortion combine(IngredientPortion other);
}
