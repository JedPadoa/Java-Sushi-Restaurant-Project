package a4jedi;

public class ShrimpPortion extends IngredientPortionImpl {
	public ShrimpPortion(double amount) {
		super(new Shrimp(), amount);
		if (amount < 0) {
			throw new RuntimeException("Amount cannot be less than zero");
		}
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (this.getIngredient().equals(other.getIngredient())) {
			return new ShrimpPortion(this.getAmount() + other.getAmount());
		} else {
			return this;
		}
	}
}
