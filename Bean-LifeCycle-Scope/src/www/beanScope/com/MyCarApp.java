package www.beanScope.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCarApp {

	public static void main(String[] args) {
		// create a place holder for the bean type
		SedanCar sedanCar;
		SedanCar suvSedanCar;

		// initiate bean
		// add required jar files
		// add folder to the build path.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifeCycle.xml");

		sedanCar = context.getBean("SedanCarBean", SedanCar.class);
		suvSedanCar = context.getBean("SedanCarBean", SedanCar.class);
		// Retrieve bean

		// call methods after bean returns an object
		
		sedanCar.breaks();
		sedanCar.gas();
		sedanCar.printCounters();
		
		
		//second initialization
		suvSedanCar.printCounters();
		
		
		System.out.println(sedanCar == suvSedanCar);
	
		// close the bean context
		context.close();
	}

}
