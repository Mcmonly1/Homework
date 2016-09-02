package Week4.Lab1;
public class Assignment {

//

	private static float score;
	private char grade;
		
//Method to retrieving the Calculated Grade
	public char CalculatedGrade(float scoreGrade){
		
		if (scoreGrade >= 90)
			grade = 'A';
		
		if (scoreGrade >= 80 && scoreGrade < 90)
			grade = 'B';
		
		if (scoreGrade >= 70 && scoreGrade < 80)
			grade = 'C';
		
		if (scoreGrade >= 60 && scoreGrade < 70)
			grade = 'D';
		
		if (scoreGrade < 60)
			grade = 'F';
		
		return grade;
	}	
// getters and setters
	public float getScore(){
		return score;
	}
	public void setScore(float scoreGrade){
		score = scoreGrade;
	}
	public void setGrade(char graed){
		grade = graed;
	}
	public char getGrade(){
		return grade;
	}
	
	}	
	

