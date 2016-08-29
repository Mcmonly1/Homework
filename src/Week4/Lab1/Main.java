package Week4.Lab1;

import java.util.Scanner;

public class Main {
	static Assignment assignment;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter a score: ");
		double score = scanner.nextDouble();
		assignment = new Assignment(score);
		System.out.println("Your grade is: " + assignment.getGrade());
	}

}
