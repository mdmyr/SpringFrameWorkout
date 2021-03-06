package www.essentials.SpringCaller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import www.essentials.cars.SedanCar;

public class MyEssentialSpringCar {

	public static void main(String[] args) {

		// bean intialization, before that check the libraries and build path
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		
		// retrieve the bean
		SedanCar sedanCar = context.getBean("SedanCarBean", SedanCar.class);
 
		sedanCar.breaks();
		sedanCar.wipers();
		sedanCar.getSafty();
		sedanCar.printSetGet();
	}

}
