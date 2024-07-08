package core_java_examples;

/*
 * Write a program to find the sum of the
 * elements of the given array
 */

public class ArraySum {
	public static void main(String[] args) {		
		int nums[] = {13,54,85,27,32,46,
					  23,84,45,28,1,75};
	
		int sum = 0;
		
		for(int n : nums) {
			sum += n;
		}
		
		System.out.println("Sum = " + sum);
		
		
	}
}
