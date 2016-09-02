package Week4.Lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float score;
		Assignment assignment = new Assignment();
		
		System.out.println("Please submit the score you achieved.");
		score = userInput.nextFloat();
		assignment.setScore(score);
		assignment.CalculatedGrade(assignment.getGrade());
		System.out.println("The grade you achieved was a " + assignment.CalculatedGrade(assignment.getScore()));
		userInput.close();
	}

}
