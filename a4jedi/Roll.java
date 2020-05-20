package a4jedi;

import java.util.ArrayList;
import java.util.Collections;

public class Roll implements Sushi {
	
	private String name;
	private IngredientPortion[] roll_ingredients;
	ArrayList<IngredientPortion> list = new ArrayList<IngredientPortion>();
	
	public Roll(String name, IngredientPortion[] roll_ingredients) {
		
		for (int z = 0; z < roll_ingredients.length; z++) {
			list.add(roll_ingredients[z]);
		}
		
		for (int j = 0; j < roll_ingredients.length; j++) {
			for (int k = j+1; k < roll_ingredients.length; k++) {
				if (list.get(j).getIngredient().equals(list.get(k).getIngredient())) {
					list.set(k, list.get(j).combine(list.get(k)));
					list.set(j, new AvocadoPortion(0.0));
				}
			}
		}
		
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (list.get(i).getIngredient().getName().equals("seaweed") && list.get(i).getAmount() < 0.1) {
				list.add(i, roll_ingredients[i].combine(new SeaweedPortion(0.05)));
				list.remove(i+1);
			}
		}
		
		int count = 0;
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (list.get(i).getIngredient().getName().equals("seaweed") && list.get(i).getAmount() >= .1) {
				count++;
			}
		}
		
		if (count == 0) {
			SeaweedPortion seaweed = new SeaweedPortion(0.1);
			list.add(seaweed);
		}
		
		this.roll_ingredients = list.toArray(roll_ingredients).clone();
		
		this.name = name;
		
		if (roll_ingredients.equals(null)) {
			throw new RuntimeException("array cannot be null");
		}
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].equals(null)) {
				throw new RuntimeException("no elements can be null");
			}
		}
	}
	
	public String getName() {
		return this.name;
	}
	public IngredientPortion[] getIngredients() {
		return this.roll_ingredients;
	}
	public int getCalories() {
		int calories = 0;
		for (int i = 0; i < roll_ingredients.length; i ++) {
			calories = calories + roll_ingredients[i].getCalories();
		}
		return calories;
	}
	public double getCost() {
		double cost = 0.0;
		for (int i = 0; i < roll_ingredients.length; i ++) {
			cost = cost + (roll_ingredients[i].getCost());
		}
		double rounded_cost = Math.round(cost * 100.0) / 100.0;
		return rounded_cost;
	}
	public boolean getHasRice() {
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsRice() == true) {
				return true;
			}
		}
		return false;
	}
	public boolean getHasShellfish() {
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsShellfish() == true) {
				return true;
			}
		}
		return false;
	}
	public boolean getIsVegetarian() {
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].getIsVegetarian() == true) {
				return true;
			}
		}
		return false;
	}
}
