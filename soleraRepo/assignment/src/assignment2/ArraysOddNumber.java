package assignment2;

import java.util.Scanner;

public class ArraysOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j]%2!=0) {
						System.out.print(arr[i][j] + " ");
					}
				}
				System.out.println();
		}
	}

}
