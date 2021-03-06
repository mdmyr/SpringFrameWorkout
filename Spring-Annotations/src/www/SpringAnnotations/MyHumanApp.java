package www.SpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyHumanApp {

	public static void main(String[] args) {
		
		HumansImplementor humans;
		System.out.println(" Started my human app \n");
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		humans = context.getBean("humansImplementor", HumansImplementor.class);
		
		humans.getDogDetails();
	}
}
