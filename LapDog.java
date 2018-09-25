package oopMore;

public class LapDog extends Dog{

	public static final double MAX_HEIGHT = 12;
	public static final double MAX_WEIGHT = 10;

	public LapDog(){
		super();
	}

	public LapDog(double ht, double wt){
		super();
		setHeight(ht);
		setWeight(wt);
	}

	@Override
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
	public void warn() {
		System.out.println("yelp yelp jump yelp yip yap(something is wrong)");
	}

	@Override
	public void attack() {
		System.out.println("bites ankle and pulls sock");
	}
	
	
	
	
	
	
	
	
	
	
	
}
