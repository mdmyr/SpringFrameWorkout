package www.SpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCarApp {

	public static void main(String[] args) {
		
		SedarCarImplmentor sedanCar;
		SuvImplementor suvBlack;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
				sedanCar = context.getBean("sedarCarImplmentor",SedarCarImplmentor.class);

		sedanCar.breaks();
		sedanCar.gas();
		
		sedanCar.getSUVDetails();
	}

}
