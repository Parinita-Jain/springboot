package core_java_examples;

import java.util.Scanner;

/*
 * Write a program to find whether the number 
 * entered by the user is even or odd
 */

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter any number... ");
		int num = s.nextInt();
		
//		if(num%2 == 0) 
//			System.out.println(num + " is even");		
//		else 
//			System.out.println(num + " is odd");
//		
//		String result = num%2 == 0 ? "EVEN" : "ODD";
//		
//		System.out.println(result);
		
		System.out.println(num + (num%2 == 0 
							? " is even" : " is odd"));
		
	}
}
