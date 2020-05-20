package a4jedi;

public class TunaPortion extends IngredientPortionImpl {
	public TunaPortion(double amount) {
		super(new Tuna(), amount);
		if (amount < 0) {
			throw new RuntimeException("Amount cannot be less than zero");
		}
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (this.getIngredient().equals(other.getIngredient())) {
			return new TunaPortion(this.getAmount() + other.getAmount());
		} else {
			return this;
		}
	}
}
