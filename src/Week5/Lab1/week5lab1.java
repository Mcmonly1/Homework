package Week5.Lab1;

import java.util.Scanner;

public class week5lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		//User selection of calculator options.
		
		System.out.println("what would you like to do?"
				+ "\n\t A.) Add."
				+ "\n\t B.) Subtract."
				+ "\n\t C.) Multiply."
				+ "\n\t D.) Divide.");
		String userChoice = userInput.next();
		if (userChoice.length()== 1) {
			char letter = userChoice.toCharArray()[0];
		System.out.println("What is the first number you want to use?");
		float num1 = userInput.nextFloat();
		System.out.println("What is the second number you want to use?");
		float num2 = userInput.nextFloat();
		
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
			
		default :
			System.out.println("you toopid put a, b, c, or d, not other letter");
			break;
		}
		}
		else 
			System.out.println("you toopid put a, b, c, or d, not other letter");
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
