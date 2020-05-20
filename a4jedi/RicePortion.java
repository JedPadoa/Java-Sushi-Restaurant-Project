package a4jedi;

public class RicePortion extends IngredientPortionImpl {
	public RicePortion(double amount) {
		super(new Rice(), amount);
		if (amount < 0) {
			throw new RuntimeException("Amount cannot be less than zero");
		}
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (this.getIngredient().equals(other.getIngredient())) {
			return new RicePortion(this.amount + other.getAmount());
		} else {
			return this;
		}
	}
}
