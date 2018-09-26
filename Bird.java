package oopMore;

public class Bird extends Animal {

	//instance variables
	private double featherLength;
	private boolean canFly;
	private boolean beakShape;
	private boolean isEdible;
	
	//default constructor	
	public Bird() {
		super();
			featherLength =  0.1;
			canFly = false;
			beakShape = true;
			isEdible = false;
		}
		//overloaded constructor
		public Bird(double fL, boolean cF, boolean bS, boolean iE) {
		super();
			fL = featherLength;
			cF = canFly;
			bS = beakShape;
			iE = isEdible;
		}
	
	public double getfeatherLength() {
		return featherLength;
	}
	public void setfeathereLength(double featherLength) {
		featherLength = fL;
	}
	public boolean getbeakShape() {
		return beakShape;
	}	
	public void setbeakShape(boolean beakShape) {
		beakShape = bS;
	}
	public boolean getisEdible() {
		return isEdible;
	}
	public void setisEdible(boolean isEdible) {
		isEdible = iE;
	}
	public boolean getcanFly() {
		return canFly;
	}
	public void setcanFly(boolean canFly) {
		canFly = cF;
	}
}
