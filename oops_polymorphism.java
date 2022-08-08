class Banks
{ 
  float getRateOfInterest()
  {
    return 0;
  } 
} 
class statebank extends Banks
{ 
  float getRateOfInterest()
  {
    return 8.4f;
  } 
}   
class ICICI extends Banks
{
  float getRateOfInterest()
  {
    return 7.3f;
  }
}
class AXIS extends Banks
{
  float getRateOfInterest()
  {
    return 9.7f;
  }
}
public class oops_polymorphism {

	public static void main(String[] args) {
		
		Banks b; 
	    b=new statebank();
	    System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
	    b=new ICICI();
	    System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
	    b=new AXIS();
	    System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
	}

}
