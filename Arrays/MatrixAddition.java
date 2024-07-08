package core_java_examples;

import java.util.Scanner;

/*
 * write a program to take 2, 3 x 3 matrices from 
 * the user and add them and store the return
 * in a new matrix
 */

public class MatrixAddition {
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] result = new int[3][3];
		Scanner s = new Scanner(System.in);
		
		//Lets take 2 matrices values from the user
		System.out.println("Provide the values for the first matrix:");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "]: ");
				a[i][j] = s.nextInt();
			}			
		}
		
		System.out.println("Provide the values for the second matrix:");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print("b[" + i + "][" + j + "]: ");
				b[i][j] = s.nextInt();
			}			
		}
		
		//adding the a and b matrix and storing in result matrix
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}			
		}
		
		//print the output
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}	
			if(i == 1)
				System.out.print("+");
			System.out.print("\t");
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + "  ");
			}
			if(i == 1)
				System.out.print("=");
			System.out.print("\t");
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
