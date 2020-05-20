package a4jedi;

public class A4Main {
	public static void main(String args[]) {
		String name = "yummy";
		double tuna_amt = 1.2;
		double rice_amt = 0.33;
		double avocado_amt = 0.75;

		IngredientPortion[] ingredientPortion = {new RicePortion(rice_amt),
				new AvocadoPortion(avocado_amt), new TunaPortion(tuna_amt)};

		Roll roll = new Roll(name,ingredientPortion);
		
		for (int i = 0; i < roll.getIngredients().length; i++) {
			System.out.println(roll.getIngredients()[i].getCalories());
		}
		System.out.println(roll.getCalories());
	}
}
