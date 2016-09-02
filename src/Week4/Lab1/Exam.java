package Week4.Lab1;

public class Exam extends Assignment {
	int questions;
	float points;
	int missed;
	
	public void exam(int questions, int missed){
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
