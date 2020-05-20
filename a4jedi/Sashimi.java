package a4jedi;

public class Sashimi implements Sushi {
	
	public enum SashimiType {TUNA, SALMON, EEL, CRAB, SHRIMP};
	IngredientPortion[] arr = new IngredientPortion[1];
	String name = "";
	int calories = 0;
	double cost = 0.0;
	
	public Sashimi(SashimiType type) {
		this.arr = arr.clone();
		if (type != null && arr != null) {
			switch(type) {
			case TUNA: this.arr[0] = new TunaPortion(0.75); name = "tuna sashimi"; calories = (int) Math.round(0.75 * 48); cost = 0.75 * 1.77;
			break;
			case CRAB: this.arr[0] = new CrabPortion(0.75); name = "crab sashimi"; calories = (int) Math.round(0.75 * 36); cost = 0.75 * 0.75;
				break;
			case EEL: this.arr[0] = new EelPortion(0.75); name = "eel sashimi"; calories = (int) Math.round(0.75 * 84); cost = 0.75 * 2.18;
				break;
			case SALMON: this.arr[0] = new SalmonPortion(0.75); name = "salmon sashimi"; calories = (int) Math.round(0.75 * 56); cost = 0.75 * 0.72;
				break;
			case SHRIMP: this.arr[0] = new ShrimpPortion(0.75); name = "shrimp sashimi"; calories = (int) Math.round(0.75 * 39); cost = 0.75 * 0.55;
				break;
			}
		}
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
		return false;
	}
	
	public boolean getHasShellfish() {
		return false;
	}
	
	public boolean getIsVegetarian() {
		return false;
	}

}
