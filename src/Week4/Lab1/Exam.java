package Week4.Lab1;

public class Exam {
	int questions;
	float points;
	int missed;
	
	public float exam(int questions, int missed){
		points = 100 / (questions - missed);
		super.setScore(points);
	}

	public float getPoints(){
		return points;
	}
	public int getMissed(){
		return missed;
	}
}
