
public class SuvCarManf {

	public static void main(String[] args) {
		
		SuvCar suvCarType = new SuvCar();		
		SuvCarBlack suvBlack=  new SuvCarBlack(suvCarType);
		
		suvBlack.vehicleType();
		suvBlack.vehicleColor();
		
		

	}

}
