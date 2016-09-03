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
		
		//User selection of calculator options.
		
		System.out.println("what would you like to do?"
				+ "\n\t A.) Add."
				+ "\n\t B.) Subtract."
				+ "\n\t C.) Multiply."
				+ "\n\t D.) Divide.");
		String userChoice = userInput.next();
		if (userChoice.length()== 1) {
			char letter = userChoice.toCharArray()[0];	
		switch(letter) {
		case 'A':
		case 'a':
			selectMathType(1);
			break;
			
		case 'B':
		case 'b':
			selectMathType(2);
			break;
		
		case 'C':
		case 'c':
			selectMathType(3);
			break;
			
		case 'D':
		case 'd':
			selectMathType(4);
			break;
			
		default :
			System.out.println("you toopid put a, b, c, or d, not other letter");
			wrongletter = true;
			break;
		}
		if(!wrongletter)
		{
		System.out.println("What is the first number you want to use?");
		num1 = userInput.nextFloat();
		System.out.println("What is the second number you want to use?");
		num2 = userInput.nextFloat();
		doMath();
		}
		}
		else
		{
			System.out.println("you toopid put a, b, c, or d, not other letter");
			wrongletter = false;
		}
	}
	public static void selectMathType(int i) {
		taipe = i;
	}
	public static void doMath() {
		float answer = 0;
		switch(taipe)
		{
		case 1:
			answer = week5lab1.addition(num1, num2);
			break;
		case 2:
			answer = week5lab1.subtraction(num1, num2);
			break;
		case 3:
			answer = week5lab1.multiply(num1, num2);
			break;
		case 4:
			answer = week5lab1.divide(num1, num2);
			break;
		}
		System.out.println("your answer is " + answer);
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
