package a4jedi;

public class SalmonPortion extends IngredientPortionImpl{
	public SalmonPortion(double amount) {
		super(new Salmon(), amount);
		if (amount < 0) {
			throw new RuntimeException("Amount cannot be less than zero");
		}
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (this.getIngredient().equals(other.getIngredient())) {
			return new SalmonPortion(this.getAmount() + other.getAmount());
		} else {
			return this;
		}
	}
}
