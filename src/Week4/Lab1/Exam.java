package Week4.Lab1;

public class Exam extends Assignment {
	int questions;
	static float points;
	int missed;
	
	public void examCalculator(int questions, int missed){
		points = 100 / (questions - missed);
		super.setScore(points);
	}

	public float getPoints() {
		return points;
	}
	public int getMissed() {
		return missed;
	}
	public int getQuestions() {
		return questions;
	}
	public void setQuestions (int value) {
		questions = value;
	}
	public void setMissed (int value) {
		missed = value;
	}
	public void setPoints (float value) {
		points = value;
	}
}
