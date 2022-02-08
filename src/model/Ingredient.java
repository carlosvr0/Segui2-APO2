package model;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException{
		
		if(additionalW >= 0) {
			weight += additionalW;
		}else {
			throw new NegativeNumberException();
		}
		
	}
	
	public void removeWeight(double inputWeight) throws NegativeNumberException{
		
		if(inputWeight >= 0) {
			weight -= inputWeight;
		}else {
			throw new NegativeNumberException();
		}
	}
}
