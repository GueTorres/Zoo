package oopMore;

import oop.Communicator;

public class Parrot extends Bird implements Communicator{

	
	public static final double MAX_HEIGHT = 40;
	public static final double MAX_WEIGHT = 3.5;

	public Parrot(){
		super();
	}

	public Parrot(double ht, double wt){
		super();
		setHeight(ht);
		setWeight(wt);
}
	
	
	public void setHeight(double ht){
		if(ht > MAX_HEIGHT){
			//we can throw an exception... or just set it the max
			super.setHeight(MAX_HEIGHT);//set it to max height val... but not greater
		}
		else{
			super.setHeight(ht);//set the value
		}
	}
	@Override
	public void setWeight(double wt){
		if(wt > MAX_WEIGHT){
			//we can throw an exception... or just set it the max
			super.setHeight(MAX_WEIGHT);//set it to max weight val... but not greater
		}
		else{
			super.setWeight(wt);//set the value
		}
}
	
	
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goodMorning() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goodNight() {
		// TODO Auto-generated method stub
		
	}

}
