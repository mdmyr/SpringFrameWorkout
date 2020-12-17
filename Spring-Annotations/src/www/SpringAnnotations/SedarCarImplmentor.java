package www.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@Component
public class SedarCarImplmentor implements VehicleInterface {
	SuvImplementor suvblack;
	
	@Autowired
	public void setSuvblack(SuvImplementor suvblack) {
		this.suvblack = suvblack;
	}

	@Override
	public void breaks() {
		System.out.println("Applying breaks");
	}
 
	@Override
	public void gas() {
		System.out.println("Applying gas!!");
	}
	
	
	public void getSUVDetails(){
		suvblack.carType();
		suvblack.color();
	}

}
