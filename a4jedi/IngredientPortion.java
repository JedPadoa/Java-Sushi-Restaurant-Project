package a4jedi;

public interface IngredientPortion {

	Ingredient getIngredient();
	String getName();
	double getAmount();
	int getCalories();
	double getCost();
	boolean getIsVegetarian();
	boolean getIsRice();
	boolean getIsShellfish();
	IngredientPortion combine(IngredientPortion other);
}
