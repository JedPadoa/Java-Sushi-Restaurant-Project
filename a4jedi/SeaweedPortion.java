package a4jedi;

public class SeaweedPortion extends IngredientPortionImpl {
	public SeaweedPortion(double amount) {
		super(new Seaweed(), amount);
		if (amount < 0) {
			throw new RuntimeException("Amount cannot be less than zero");
		}
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (this.getIngredient().equals(other.getIngredient())) {
			return new SeaweedPortion(this.getAmount() + other.getAmount());
		} else {
			return this;
		}
	}
}
