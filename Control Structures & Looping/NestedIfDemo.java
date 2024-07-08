package core_java_examples;

import java.util.Scanner;

/*
 * Write a program to take a number from the 
 * user and find whether the number is
 * divisible by 3 or 5 or not
 * 
 * For divisiblity we use % operator
 * num % 3 == 0
 */

public class NestedIfDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter any number... ");
		int num = s.nextInt();
		
		if(num % 3 == 0) {
			//==> nested if ==> will be executed only if the number is divisible by 3
			if(num % 5 == 0) {
				System.out.println(num + " is divisible by 3 and 5");
			}else {
				System.out.println(num + " is divisible by 3");
			}
		}
		else if(num % 5 == 0){
			System.out.println(num + " is divisible by 5");
		}
		else {
			System.out.println(num + " is divisible neither by 3 nor by 5");
		}
	}
}
