package www.beanScope.com;

public class SedanCar implements VehicleInterface {
   // private counter for the initiations.
	private static int counter=0;
	
	//init-method
	
	public void initializSedan() {
		System.out.println("\n : : : :  INIT-method Initilizaation : : : : : :  \nSedan Car manufacturing is initialized: \n");
	}
	
	
	@Override
	public void breaks() {
		counter= counter+1;
		System.out.println("Sedan :Applied Breaks");

	}

	@Override
	public void gas() {
		
		System.out.println("Sedan : Push the gas!!!");
	}

	public void printCounters(){
		System.out.println("Number of times object initiated :" + counter);
	}
	
	public void closeSedan() {
		System.out.println("\n : : : :  Destroy-method Initilizaation : : : : : :  \\nSedan Car manufacturing has been Destroy:");
	}
}
