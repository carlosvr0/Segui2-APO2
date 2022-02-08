package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Ingredient;
import model.Recipe;

class RecipeTest {

	public Recipe receta;
	
	public void setupStage1() {
		receta = new Recipe(null,0);
	}

	public void setupStage2() throws NegativeNumberException {
		receta = new Recipe("RECETA 1",1);
		receta.addIngredient("Cebolla",315);
		receta.addIngredient("Ajo",58);
		receta.addIngredient("Arroz",520);
	}
	
	
	@Test
	public void addIngredientTest1() throws NegativeNumberException {
		setupStage1();
		receta.addIngredient("Sal",12);
		assertEquals(1,receta.getIngredients().size());
	}
	
	@Test
	public void addIngredientTest2() throws NegativeNumberException {
		setupStage2();
		receta.addIngredient("Pimienta",6);
		assertEquals(4,receta.getIngredients().size());
		assertEquals("Pimienta", receta.getIngredients().get(receta.getIngredients().size()-1).getName());
	}
	 
	@Test
	public void addIngredientTest3() throws NegativeNumberException {
		setupStage2();
		receta.addIngredient("Ajo",21);
		assertEquals(3,receta.getIngredients().size());
		assertEquals(79, receta.getIngredients().get(1).getWeight());
	}
	
	@Test
	public void removeIngredientTest1() throws NegativeNumberException {
		setupStage2();
		receta.removeIngredient("Ajo");
		assertEquals(2,receta.getIngredients().size());
	}
	
	
	
	
}
