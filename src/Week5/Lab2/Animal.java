package Week5.Lab2;

public abstract class Animal {
	private boolean hair = false;
	private boolean feathers = false;

	public abstract String run();
	
	public abstract String fly();
	
	public String makesNoise (boolean hair, boolean feathers) {
		
		String noise1 = "Moo";
		String noise2 = "Caw";
		String noise3 = "Hiss";
		String returnNoise = null;
		
		if (hair && !feathers) {
			returnNoise = noise1;
		}	
		if (!hair && feathers) {
			returnNoise = noise2;
		}
		else {
			returnNoise = noise3;
		}
		return returnNoise;
	}
		
	// Setters

	public void setHair (boolean value) {
		hair = value;
	}
	public void setFeathers (boolean value) {
		feathers = value;
	}
	
	// Getters
	
	public boolean getHair () {
		return hair;
	}
	public boolean getFeathers () {
		return feathers;
	}
}


