package oopMore;

public class Peacock extends Bird{

	
	public static final double MAX_HEIGHT = 92;
	public static final double MAX_WEIGHT = 13;

	public Peacock(){
		super();
	}

	public Peacock(double ht, double wt){
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


