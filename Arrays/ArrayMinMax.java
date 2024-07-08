package core_java_examples;

/*
 * write a program to find the 
 * largest and the smallest number
 * from the array given
 */

public class ArrayMinMax {
	public static void main(String[] args) {
		int nums[] = {13,54,85,18,27,32,46,
				  	  23,84,45,28,71,75,91};
		
		int max = nums[0];
		int min = nums[0];
		
		for(int n : nums) {
			if(max < n)
				max = n;
			
			if(min > n)
				min = n;
		}
		
		System.out.println("Largest Number = " + max);
		System.out.println("Smallest Number = " + min);
	}
}
