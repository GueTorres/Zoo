

public class Animal implements Survivor, HealthIndex{

	//instance variables
	private int numLegs;
	private double height;
	private double weight;
	private boolean hasFur;
	private char gender; //'u','m','f'
	private String color;
	private double BMI;
	//default constructor
	public Animal(){
		numLegs = 0;
		weight =0;
		height =0;
		color = "unknown";
		hasFur = false;
		gender = 'u';
	}
	//overloaded constructor
	public Animal(int nLegs, double wt, double ht, String col, boolean hasF, char g){
		numLegs = nLegs;
		weight = wt;
		height = ht;
		color = col;
		hasFur = hasF;
		gender = g;
		
	}
	//getters
	public double getBMI() throws Exception {
		if(weight == 0){
			throw new Exception("can't calculate BMI weight is zero");
		}
		return height / (weight * weight);
	}
	public int getNumLegs() {
		return numLegs;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public boolean isHasFur() {
		return hasFur;
	}
	public char getGender() {
		return gender;
	}
	public String getColor() {
		return color;
	}
	//setters
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setColor(String color) {
		this.color = color;
	}

	//toString
	@Override
	public String toString() {
		return "Animal [numLegs=" + numLegs + ", height=" + height
				+ ", weight=" + weight + ", hasFur=" + hasFur + ", gender="
				+ gender + ", color=" + color + "]";
	}
	//equals
	public boolean equals(Object o){
		if(o instanceof Animal){
			Animal otherAn = (Animal)o;
			if(this.hasFur == otherAn.hasFur){
				if(this.height == otherAn.height){
					if(this.weight == otherAn.weight){
						if(this.gender == otherAn.gender){
							if(this.color.equalsIgnoreCase(otherAn.color) ){
								if(this.numLegs == otherAn.numLegs){
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	@Override
	public double getBMI() {
		
		/**
		 * google the BMI formula and use it
		 * to calculate and return the BMI
		 *  of an Animal
		 */
		return BMI;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goPotty() {
		// TODO Auto-generated method stub
		
	}

}
