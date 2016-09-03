package Week5.Lab2;

public class Dog extends Animal implements NonFlying {
	private String _name = "";
	
	public Dog(boolean b, boolean c) {
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
		return "A dog walks on all fours";
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return "A dog runs";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "A dog wishes it could fly";
	}

}
