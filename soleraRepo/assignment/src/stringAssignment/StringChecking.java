package stringAssignment;

import java.util.Scanner;

public class StringChecking {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		
		System.out.println("***************************************************");
		
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		
		
		System.out.println("***************************************************");
		
		System.out.println(hannah.charAt(12));
		
		System.out.println("***************************************************");
		String input ="Was it a car or a cat I saw?";
		
		System.out.println(input.substring(9,12));
	}
}