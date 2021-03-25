package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numOne;
		double numTwo;
		double result = 0.0;
		char operators;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		numOne = input.nextDouble();
		
		System.out.println("Please enter the second number");
		numTwo = input.nextDouble();
		
		System.out.println("Please enter a operator");
		operators = input.next().charAt(0);
		
		switch (operators) {
			
		case '+' : result = numOne + numTwo;
		break;
		
		case '-' : result = numOne - numTwo;
		break;
		
		case '*' : result = numOne * numTwo;
		break;
		
		case '/' : result = numOne / numTwo;
		break;
		}
		
		System.out.println(numOne + " " + operators + " " + numTwo + " " + "= " + result);
	}

}
