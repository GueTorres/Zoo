package oopMore;

public class Dog extends Animal implements Protector{

	//instance variables
	private double tailLength;
	private String eyeColor;
	private double teethLength;
	private String [] tricks = new String[5]; //add all the details as needed for homework
	
	//default constructor
	public Dog(){
		super();
		tailLength = 5;
		eyeColor = "brown";
		teethLength = .75;
	}
	//overloaded constructor
	public Dog(double tL, String eyeCol, double teethLen ){
		super();
		tailLength = tL;
		eyeColor = eyeCol;
		teethLength = teethLen;
	}
	//overloaded constructors
	//getters
	public double getTailLength(){
		return tailLength;
	}
	public String getEyeColor(){
		return eyeColor;
	}
	public double getTeethLength(){
		return teethLength;
	}
	//setters
	public void setTailLength(double tL){
		tailLength = tL;
	}
	public void setEyeColor(String eyeCol){
		eyeColor = eyeCol;
	}
	public void setTeethLength(double teethLen){
		teethLength = teethLen;
	}
	//toString
	
	//equals
	
	@Override
	public void warn() {
		System.out.println("GRRR WOOOF GRRR");
	}

	@Override
	public void attack() {
		System.out.println("Jump GRRR Run");
	}

	@Override
	public void askForHelp() {
		System.out.println("MMMM woof mmm");
	}

}
