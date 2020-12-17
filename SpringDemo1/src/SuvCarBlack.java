
public class SuvCarBlack implements Vehicle {

	private SuvCar suvBlack;
	
	public SuvCarBlack(SuvCar carType) {
		System.out.println("Am in the constructor of SuvCarBlack");
		this.suvBlack=carType;
	}

	@Override
	public void vehicleColor() {
		//suvBlack.vehicleColor();
		System.out.println("Modified to Black");
		
	}

	@Override
	public void vehicleType() {
		suvBlack.vehicleType();
		
	}
	
	

}
