package www.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class SuvImplementor {

	public void carType() {
		System.out.println("This is a SUV");
		
	}
	
	public void color(){
		System.out.println("Color is Black");
	}
}
