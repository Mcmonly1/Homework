package Week4.Lab1;

public class Assignment {

	private double score;
	
private String CalculateGrade(double scoreGrade)
{
	String grade = null;
	if(score > 90)
		grade = "A";
	
	if (score >= 80 && score < 90)
		grade = "B";
	
	if (score >= 70 && score < 80)
		grade = "C";
	
	if (score >= 60 && score < 70)
		grade = "D";
	
	else
		grade = "F";
	
	return grade;
}

private double getScore(){
	return score;
	}
private void setScore (double value){
	score = value;
	}
}

