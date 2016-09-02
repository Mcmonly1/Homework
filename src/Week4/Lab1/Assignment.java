package Week4.Lab1;
public class Assignment {

 // Wondering if this is all I need to start making this into an object.

	private float score;
		

	public String CalculatedScore(float scoreGrade, String grade){
		
		if (scoreGrade >= 90)
			grade = "A";
		
		if (scoreGrade >= 80 && scoreGrade < 90)
			grade = "B";
		
		if (scoreGrade >= 70 && scoreGrade < 80)
			grade = "C";
		
		if (scoreGrade >= 60 && scoreGrade < 70)
			grade = "D";
		
		if (scoreGrade < 60)
			grade = "F";
		
		return grade;
	}	
// Is this the proper way to set the scoreGrade from the input of the user on the main class.
	public float getScore(){
		return score;
	}
	public void setScore(float scoreGrade){
		score = scoreGrade;
	}
	}	
	

