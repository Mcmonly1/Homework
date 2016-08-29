package Week4.Lab1;

public class Assignment {

	private double score = 75;
	
private String CalculateGrade(double scoreGrade)
{
	String grade = null;
	if(score > 90)
	{
		grade = "A";
		return grade;
	}
	
	if (score >= 80 && score < 90)
	{
		grade = "B";
		return grade;
	}
	
	if (score >= 70 && score < 80)
	{
		grade = "C";
		return grade;
	}
	else
	{
		grade = "F";
		return grade;
	}
}

private double getScore(){
	return score;
	}
private void setScore (double value){
	score = value;
	}
}

