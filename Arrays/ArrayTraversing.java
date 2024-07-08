package core_java_examples;

public class ArrayTraversing {
	public static void main(String[] args) {
		int nums[] = {3,4,5,7,32,46,23,84,45,28,1,75};
		
		System.out.println("Length of the array: " 
						+ nums.length);
		
		//Here in order to access individual element
		//of the array we can use counter based loops
		
		//for(int i = 0; i < nums.length; i++) {
		for(int i = 0; i <= nums.length - 1; i++) {
			System.out.println(nums[i]);
		}
		
		//enhanced for loop / for each loop
		System.out.println("Using for each loop");
		for(int n : nums) {
			System.out.println(n);
		}
		
		String colors[] = {"blue","red",
						   "yellow","green",
						   "white","black",
						   "brown","maroon",
						   "purple","pink"};
		
		for(String c : colors) {
			System.out.println(c);
		}
							
	}
}
