package core_java_examples;

import java.util.Scanner;

/*
 * Write a program to take 10 random numbers
 * from the user and print their sum
 * 
 * Input => 10 Random Numbers from the user
 */

public class ForLoopRandomNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		//using for loop
		for(int i=1; i<=10; i++) {
			System.out.print("Enter any number... ");
			int num = s.nextInt();
			
//			sum = sum + num;
			sum += num; //compound assignment
		}
		
		//using while loop
//		int i = 1; //initialize
//		while(i <= 10) { //condition
//			System.out.print("Enter any number... ");
//			int num = s.nextInt();
//			sum += num;
//			i++; //updation
//		}
		
		System.out.println("Sum = " + sum);
	}

}
