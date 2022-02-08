package model;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Ingredient;

class IngredientTest {

	private Ingredient ingre;
	
	public void setupStage1() {
		 ingre = new Ingredient("Tomate",245);
	}
	
	@Test
	public void addWeightTest1() throws NegativeNumberException{
		setupStage1();
		ingre.addWeight(54);
		assertEquals(299,ingre.getWeight());
	}
	
	@Test
	public void addWeightTest2() throws NegativeNumberException {
		setupStage1();
		
		try {
			ingre.addWeight(-100);
			fail("Deberia lanzarse una exception");
		}catch (NegativeNumberException e) {
			assertEquals(e.getMessage(), "No se puede usar numeros negativos");
		}
		
	}
	
	@Test
	public void removeWeightTest1() throws NegativeNumberException {
		setupStage1();
		ingre.removeWeight(45);
		assertEquals(200,ingre.getWeight());
	}
	
	
	@Test
	public void removeWeightTest2() throws NegativeNumberException{
		setupStage1();
		
		try {
			ingre.removeWeight(-100);
			fail("Deberia lanzarse una exception");
		}catch (NegativeNumberException e) {
			assertEquals(e.getMessage(), "No se puede usar numeros negativos");
		}
	}
	
	
	
	
	
	
}


