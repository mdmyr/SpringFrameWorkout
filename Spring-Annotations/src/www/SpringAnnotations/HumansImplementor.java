package www.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HumansImplementor implements Animals {

	@Autowired
	Dogs dogprototype;
	
	
	@Override
	public void noOFLegs() {
		System.out.println(" No of legs : 2 \n");
	}

	@Override
	public void noOfHands() {
		System.out.println(" No of Hands : 2");
	}

//	@Autowired
//	public HumansImplementor(Dogs dogprototype) {
//			this.dogprototype=dogprototype;
//	}
//		
	
	public void getDogDetails() {
		dogprototype.noOfHands();
		dogprototype.noOFLegs();
	}

//	@Autowired
//	public void setDogprototype(Dogs dogprototype) {
//		this.dogprototype = dogprototype;
//	}
	
//	@Autowired
//	public void checkonDogDetails(Dogs dogprototype) {
//		
//		System.out.println("Any name of the method but with AutoWired annotation");
//		this.dogprototype=dogprototype;
//	}
	
	
}
