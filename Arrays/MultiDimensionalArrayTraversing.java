package core_java_examples;

public class MultiDimensionalArrayTraversing {
	public static void main(String[] args) {
		//int[] nums[] ==> valid
		//int[][] nums ==> valid
		//int nums[][] ==> valid
		int[] nums[] = {{2,3,5},
						{5,4,6},
						{9,4,3}};
		
		//the above 2D array contains 3 rows 
		//and 3 columns
		//we can use nested loops to traverse through
		//this array
		//the number of iteration of the outer loop
		//can be based on the number of rows
		//the number of iteration of the inner loop
		//can be based on the number of columns
		
		//outer loop
		for(int i = 0; i < nums.length; i++) {
			//inner loop
			for(int j = 0; j < nums[i].length; j++) {
				System.out.println("Row: " + i 
						         + ", Column: " + j
						         + ", Value: " + nums[i][j]);
			}
		}
	}
}
