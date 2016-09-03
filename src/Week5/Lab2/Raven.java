package Week5.Lab2;

public class Raven  extends Animal implements Flying {
	private String _name = "";
	
	public Raven(boolean hair, boolean Feathers) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		_name = name;
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "A raven takes off from a standing position";
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return "A raven does not run";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "A raven does fly";
	}
	
	

	

}
