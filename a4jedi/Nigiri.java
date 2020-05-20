package a4jedi;

public class Nigiri implements Sushi {
	
	public enum NigiriType {TUNA, SALMON, EEL, CRAB, SHRIMP};
	IngredientPortion[] arr = new IngredientPortion[2];
	String name = "";
	int calories = 0;
	double cost = 0.0;
	
	public Nigiri(NigiriType type) {
		this.arr = arr.clone();
		if (type != null && arr != null) {
			switch(type) {
			case TUNA: this.arr[0] = new TunaPortion(0.75); name = "tuna nigiri"; calories = (int) Math.round(0.75 * 48 + .5 * 37); cost = 0.75 * 1.77 + .5 * .12;
			break;
			case CRAB: this.arr[0] = new CrabPortion(0.75); name = "crab nigiri"; calories = (int) Math.round(0.75 * 36 + .5 * 37); cost = 0.75 * 0.75 + .5 * .12;
				break;
			case EEL: this.arr[0] = new EelPortion(0.75); name = "eel nigiri"; calories = (int) Math.round(0.75 * 84 + .5 * 37); cost = 0.75 * 2.18 + .5 * .12;
				break;
			case SALMON: this.arr[0] = new SalmonPortion(0.75); name = "salmon nigiri"; calories = (int) Math.round(0.75 * 56 + .5 * 37); cost = 0.75 * 0.72 + .5 * .12;
				break;
			case SHRIMP: this.arr[0] = new ShrimpPortion(0.75); name = "shrimp nigiri"; calories = (int) Math.round(0.75 * 39 + .5 * 37); cost = 0.75 * 0.55 + .5 * .12;
				break;
			}
		}
		arr[1] = new RicePortion(.5);
	}
	
	public String getName() {
		return name;
	}
	
	public IngredientPortion[] getIngredients() {
		return this.arr;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public double getCost() {
		return cost;
	}
	
	public boolean getHasRice() {
		return true;
	}
	
	public boolean getHasShellfish() {
		return false;
	}
	
	public boolean getIsVegetarian() {
		return false;
	}
}
