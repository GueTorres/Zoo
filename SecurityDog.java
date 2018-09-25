package oopMore;

public class SecurityDog extends Dog {
   
  public void warn() {
  System.out.println("GRRR GRRRRRR");  
  }
  
  public void attack() {
  System.out.println("BITE BITE BITE");
  }
  
  @Override
  public void askForHelp(){
      //not doing that...machismo
      //Never surrender!
  }
  
}
