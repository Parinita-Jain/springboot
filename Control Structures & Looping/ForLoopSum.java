package core_java_examples;

/*
 * Write a program to calculate the sum of 
 * the first 10 natural numbers
 * 
 * 1,2,3,4,5,6,7,8,9,10
 * 
 * Values will be generate one by one using loop
 */

public class ForLoopSum {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum = " + sum);
	}
}
