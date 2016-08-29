package Week4.Lab1;

public class Assignment {

	private double score;
	private static char grade;
	
private char CalculateGrade(double scoreGrade)
{
	if(score > 90)
		grade = 'A';
	if (score >= 80 && score < 90)
		grade = 'B';
	if (score >= 70 && score < 80)
		grade = 'C';
	if (score >= 60 && score < 70)
		grade = 'D';
	if(score < 60)
		grade = 'F';
	
	return grade;
}
public Assignment(double score) {
	setScore(score);
	setGrade(CalculateGrade(getScore()));
}

char getGrade() {
	return grade;
}

private double getScore() {
	return score;
	}

private void setScore(double value) {
	score = value;
	}

private void setGrade(char graed) {
	grade = graed;
}
}

