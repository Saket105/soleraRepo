package stringAssignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		
		str = str.replace(" ", "");
		str1 = str1.replace(" ", "");
		str = sort(str);
		str1 = sort(str1);
		
		if(str.equals(str1)) {
			System.out.println("It's an anagram");
		}else {
			System.out.println("Not an anagram");
		}
	}
	
	public static String sort(String str) {
		char temp[] = str.toCharArray();
		  Arrays.sort(temp);
		return new String(temp);
	}
}
