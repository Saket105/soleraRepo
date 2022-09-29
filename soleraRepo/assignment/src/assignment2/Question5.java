package assignment2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
	
			int a[][] = new int[m][n];
			int b[][] = new int[m][n];
			int result[][] = new int[m][n];

			System.out.println("Enter Elements of A matrix");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter Elements of B matrix");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			System.out.println("Elements of A matrix");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println("Elements of B matrix");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println();
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					result[i][j] = a[i][j] + b[i][j];
				}
			}

			System.out.println("After adding the Matrix A and matrix B");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
	}

}
