package arithmetic;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the operation from \n1. +\n2. -\n3. *\n4. /");
		int operator = sc.nextInt();
		int result = 0;
		System.out.println("You selected " + operator);
//
		System.out.println("Please Provide the First Number");
		int a = sc.nextInt();
//
		System.out.println("Please Provide the Second Number");
		int b = sc.nextInt();

		CalculatorHelper calHelp = new CalculatorHelper(a,b);

		calHelp.calculate(operator);
		
//		String exp[] = { "12", "+", "9", "*", "2" };
//
//		for (int i = 1; i < exp.length - 1; i = i + 2) {
//			int counter = 0;
//			counter = i;
//			int res1 = 0;
//			int number1 = 0;
//			int number2 = 0;
//			int number3 = 0;
//			
//			if (i == 1) {
//				number1 = Integer.parseInt(exp[counter - 1]);
//				number2 = Integer.parseInt(exp[counter + 1]);
////
//				CalculatorHelper calHelp = new CalculatorHelper(number1, number2, i);
//				calHelp.calculate(exp[i]);
////
//				if (exp[i].equals("+")) 
//				{
//					res1 = number1 + number2;
//				} 
//				else if (exp[i].equals("-"))
//				{
//					res1 = number1 - number2;
//				} else if (exp[i].equals("*"))
//				{
//					res1 = number1 * number2;
//				} else if (exp[i].equals("/")) 
//				{
//					res1 = number1 / number2;
//				}
//				result += res1;
				
//			} else {
//				num3 = Integer.parseInt(arr[counter + 1]);
//				CalculatorHelper calHelp = new CalculatorHelper(res, num3);
//				calHelp.calculate(arr[i]);
//				if (arr[i].equals("+")) {
//					res = res + num3;
//				} else if (arr[i].equals("-")) {
//					res = res - num3;
//				} else if (arr[i].equals("*")) {
//					res = res * num3;
//				} else if (arr[i].equals("/")) {
//					res = res / num3;
//				}
//				res += res1;
//
//			}
//
//			}
//		}
//		System.out.println(res);
	}
}
