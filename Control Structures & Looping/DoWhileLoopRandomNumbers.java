package core_java_examples;

import java.util.Scanner;

/*
 * Write a program to take random numbers 
 * from the user and add them up. 
 * But program take only positive random numbers
 * from the user
 */

public class DoWhileLoopRandomNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
		do {
			System.out.print("Enter any number... ");
			num = sc.nextInt();
			
			sum += num;
		}while(num > 0);
		
		System.out.println("Sum = " + sum);
	}
	
}
