package assignment3;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.nextLine();
		System.out.println("Enter the start indices");
		int start = sc.nextInt();
		System.out.println("Enter the end indices");
		int end = sc.nextInt();
		System.out.println("Result is: ");
		System.out.println(str.substring(start,end));
	}

}
