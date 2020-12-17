package www.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Dogs implements Animals {

	@Override
	public void noOFLegs() {
		System.out.println(" No of legs for dogs : 2 but short \n");
	}

	@Override
	public void noOfHands() {
		System.out.println(" NO of hands for dogs : 2 but short \n");
	}

}
