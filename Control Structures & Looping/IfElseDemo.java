package core_java_examples;

import java.util.Scanner;

/*
 * Write a program to take a number from the 
 * user and tell if the number is positive or
 * negative or zero
 */

public class IfElseDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number...");
		int num = s.nextInt();
		
		if(num > 0) {
			System.out.println("Number is positive");
		}
		else if(num < 0){
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
	}
}
