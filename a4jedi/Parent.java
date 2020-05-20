package a4jedi;

abstract public class Parent implements Ingredient {
	
	private String name;
	private boolean is_vegetarian;
	private double price;
	private int calories;
	private boolean is_rice;
	private boolean is_shellfish;
	
	public Parent(String name, double price, int calories, boolean is_vegetarian, boolean is_rice, boolean is_shellfish) {
		this.name = name;
		this.is_vegetarian = is_vegetarian;
		this.price = price;
		this.calories = calories;
		this.is_rice = is_rice;
		this.is_shellfish = is_shellfish;
		
		if (name.equals(null)) {
			throw new RuntimeException("Name cannot be null");
		}
		if (price < 0.0) {
			throw new RuntimeException("Price cannot be less than zero");
		}
		if (calories < 0) {
			throw new RuntimeException("Calories cannot be less than zero");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getIsVegetarian() {
		return is_vegetarian;
	}
	
	public double getPricePerOunce() {
		return price;
	}
	
	public int getCaloriesPerOunce() {
		return calories;
	}
	
	public double getCaloriesPerDollar() {
		return calories/price;
	}
	
	public boolean getIsRice() {
		return is_rice;
	}
	
	public boolean getIsShellfish() {
		return is_shellfish;
	}
	
	public boolean equals(Ingredient other) {
		if (this.getName() == other.getName() && this.getCaloriesPerOunce() == other.getCaloriesPerOunce() && Math.abs(this.price - other.getPricePerOunce()) <= 0.1) {
			return true;
		} else {
			return false;
		}
	}
}
