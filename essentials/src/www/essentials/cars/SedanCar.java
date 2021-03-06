package www.essentials.cars;

public class SedanCar implements CarEssentials {

	private String email;
	
	public String getEmail() {
		return email;
	}


	private String location;
	
	public void setEmail(String email) {
		this.email = email;
	}



	public void setLocation(String location) {
		this.location = location;
	}


	private essentialsCarAddonSafety escAddons;
	
	public void setEscAddons(essentialsCarAddonSafety escAddons) {
		this.escAddons = escAddons;
	}
	

	 
	@Override
	public void breaks() {
		System.out.println("Breaks applied");

	}

	@Override
	public void wipers() {
		System.out.println("Wipers Built");
	}

	@Override
	public void gas() {
		System.out.println("Gas applied");
	}

	@Override
	public void wheels() {
		System.out.println("Wheels applied");
	}
	
	
  public void getSafty() {
	  System.out.println("Am in the getter method");
	  escAddons.safetyAddon();
  }
  
  public void printSetGet() {
	  System.out.println( "Email : " + getEmail());
	  System.out.println( "Location :" + getLocation());
  }



public String getLocation() {
	return location;
}
	

}
