package core_java_examples;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		//declaring multidimensional
		//2D Array
		
		int[][] n1 = new int[5][3];
		
		int n2[][] = {{1,2,3,4}
					,{5,6,7,8}
					,{3,4,1,7}};
		
		System.out.println(n2[1][2]);
		System.out.println(n2[2][2]);
		
		//this will give number of rows 
		//sub arrays in the main array
		System.out.println(n2.length);
		
		//this will give number of columns
		//number of values in row index specified
		System.out.println(n2[2].length);
		
	}
}
