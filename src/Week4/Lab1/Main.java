package Week4.Lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int questions;
		int missed;
		
		Exam exam = new Exam();
		Assignment assignment = new Assignment();
		
		System.out.println("How many questions were on the exam?");
		questions = userInput.nextInt();
		System.out.println("How many questions did you miss on the exam?");
		missed = userInput.nextInt();
		exam.setQuestions(questions);
		exam.setMissed(missed);
		exam.examCalculator(questions, missed);
		assignment.CalculatedGrade(assignment.getGrade());
		System.out.println("The questions were worth " + exam.getPoints() + " points each.");
		System.out.println("Your score was " +exam.getScore() + " out of 100.");
		System.out.println("The grade you achieved was a " + assignment.CalculatedGrade(assignment.getScore()));
		userInput.close();
	}

}
