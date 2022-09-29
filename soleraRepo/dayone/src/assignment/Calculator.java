package assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CalculatorHelper cal = new CalculatorHelper();
		System.out.println("Please select the operation from \n1. +\n2. -\n3. *\n4. /");
		int operator = sc.nextInt();
		System.out.println("You selected " + operator);

		if (operator > 4) {
			System.out.println("You selected wrong operator");
		} else {

			System.out.println("Please Provide the First Number");
			int numberOne = sc.nextInt();
		
		System.out.println("Please Provide the Second Number");
		int numberTwo = sc.nextInt();
		
		switch (operator) {
		
		case 1:
//			System.out.println(numberOne+numberTwo);
			
			System.out.println(cal.add(numberOne, numberTwo));
			
			break;
		case 2:
			System.out.println(numberOne-numberTwo);
			break;
			
		case 3:
//			System.out.println(numberOne*numberTwo);
			
			System.out.println(cal.multiply(numberOne, numberTwo));
			break;
			
		case 4:
			System.out.println(numberOne/numberTwo);
			break;
		default:
			System.out.println("You selected wrong operator");
		}
	}
	}

}
