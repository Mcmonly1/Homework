package Week4.Lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		float score;
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
// Lost on how to get points to assignment class and still be able to display points for each question in console.
		exam.setPoints(points);
		assignment.CalculatedGrade(assignment.getGrade());
		System.out.println("The grade you achieved was a " + assignment.CalculatedGrade(assignment.getScore()));
		userInput.close();
	}

}
