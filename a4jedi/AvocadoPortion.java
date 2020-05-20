package a4jedi;

public class AvocadoPortion extends IngredientPortionImpl {
	public AvocadoPortion(double amount) {
		super(new Avocado(), amount);
		if (amount < 0) {
			throw new RuntimeException("Amount cannot be less than zero");
		}
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (this.getIngredient().equals(other.getIngredient())) {
			IngredientPortion avocado = new AvocadoPortion(this.getAmount() + other.getAmount());
			return avocado;
		} else {
			return this;
		}
	}
}
