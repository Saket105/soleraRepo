package assignment2;

import java.util.Scanner;

public class ArrayEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		int[] arr = new int[arrLength];
		for(int i=0;i<arrLength;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("*******************Even Numbers from Array****************");
		for(int a:arr) {
			if(a%2==0) {
				System.out.print(a+" ");
			}
		}
	}

}
