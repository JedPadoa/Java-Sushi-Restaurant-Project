package a4jedi;

public class CrabPortion extends IngredientPortionImpl {
	public CrabPortion(double amount) {
		super(new Crab(), amount);
		if (amount < 0) {
			throw new RuntimeException("Amount cannot be less than zero");
		}
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (this.getIngredient().equals(other.getIngredient())) {
			IngredientPortion crab = new CrabPortion(this.getAmount() + other.getAmount());
			return crab;
		} else {
			return this;
		}
	}
}
