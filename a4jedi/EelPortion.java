package a4jedi;

public class EelPortion extends IngredientPortionImpl {
	public EelPortion(double amount) {
		super(new Eel(), amount);
		if (amount < 0) {
			throw new RuntimeException("Amount cannot be less than zero");
		}
	}
	
	public IngredientPortion combine(IngredientPortion other) {
		if (this.getIngredient().equals(other.getIngredient())) {
			IngredientPortion eel = new EelPortion(this.getAmount() + other.getAmount());
			return eel;
		} else {
			return this;
		}
	}
}
