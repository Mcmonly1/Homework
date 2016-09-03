package Week5.Lab2;

public class Bat extends Animal implements Flying {
	private String _name = "";
	
	public Bat(boolean b, boolean c) {
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
		return "A bat takes off from being upside down";
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return "A bat definitely does not run";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "A bat does fly";
	}

}
