package core_java_examples;

import java.util.Scanner;

/*
 * Write a program to take random numbers 
 * from the user and add them up. 
 * But program take only positive random numbers
 * from the user
 */

public class WhileLoopRandomNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		//Take the first number as the input
		System.out.print("Enter any number... ");
		int num = sc.nextInt();
		
		//Loop will be repeated based on just condition
		while(num > 0) {
//		for(; num > 0;) {
			sum += num;
			System.out.print("Enter any number... ");
			num = sc.nextInt();			
		}
		
		System.out.println("Sum = " + sum);
	}
}
