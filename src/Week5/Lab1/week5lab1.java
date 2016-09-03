package Week5.Lab1;

import java.util.Scanner;

public class week5lab1 {
private static float num1;
private static float num2;
private static int taipe;
private static boolean wrongletter = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		String keepGoing = "y";
		
		//User selection of calculator options.
		
		while(keepGoing.toUpperCase().equals("Y")) {

		System.out.println("what would you like to do?"
				+ "\n\t A.) Add."
				+ "\n\t B.) Subtract."
				+ "\n\t C.) Multiply."
				+ "\n\t D.) Divide.");
		String userChoice = userInput.next();
		try {
			System.out.println("What is the first number you want to use?");
			float num1 = userInput.nextFloat();
			System.out.println("What is the second number you want to use?");
			float num2 = userInput.nextFloat();

			
		if (userChoice.length()== 1) {
			char letter = userChoice.toCharArray()[0];
		
		switch(letter) {
		
		case 'A':
		case 'a':
			float answerA = week5lab1.addition(num1, num2);
			System.out.println("your answer is " + answerA);
			break;
			
		case 'B':
		case 'b':
			float answerB = week5lab1.subtraction(num1, num2);
			System.out.println("your answer is " + answerB);
			break;
		
		case 'C':
		case 'c':
			float answerC = week5lab1.multiply(num1, num2);
			System.out.println("your answer is " + answerC);
			break;
			
		case 'D':
		case 'd':
			float answerD = week5lab1.divide(num1, num2);
			System.out.println("your answer is " + answerD);
			break;
			
		default:
			System.out.println("please select a letter and not a number.");
			keepGoing = "Y";
			break;

		}
		}


		
		System.out.println("Do you want to continue? (y/n)");
		keepGoing = userInput.next();
		System.out.println("please enter a number not a letter");
		userInput.nextLine();
		keepGoing = "Y";
	} catch (Exception ex) {
		System.out.println("Please enter a number not a letter");
		keepGoing = "Y";
	}
	}
	}
	public static float addition(float num1, float num2) {
		float answer;
		answer = num1 + num2;
		return answer;
	}
	public static float subtraction(float num1, float num2) {
		float answer;
		answer = num1 - num2;
		return answer;
	}
	public static float multiply(float num1, float num2) {
		float answer;
		answer = num1 * num2;
		return answer;
	}
	public static float divide(float num1, float num2) {
		float answer;
		answer = num1 / num2;
		return answer;
	}

}
