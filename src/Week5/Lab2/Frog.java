package Week5.Lab2;

public class Frog extends Animal implements NonFlying {
	private String _name = "";

	public Frog(boolean b, boolean c) {
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
	public String movement() {
		// TODO Auto-generated method stub
		return "Hops around gleefully";
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return "A hopping frog knows not how to run";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "A frog flies for a brief amount of time, but eventually gravity says otherwise";
	}


}
