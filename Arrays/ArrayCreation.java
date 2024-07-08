package core_java_examples;

public class ArrayCreation {
	public static void main(String[] args) {	
		//marks is the array variable
		//which is able to access 50 locations
		//all 50 locations are initialized 
		//with the default values
		float marks[] = new float[50];
		
		//we can also create the array by 
		//specifying the initail values
		//here the size of the array will be 
		//decided by the number of elements/value
		//added in the array
		int[] score = {4,5,3,2,6,3,6,4};
		
		int age[] = {23,34,42,56,27,33,45};
		
		System.out.println(marks.length);
		System.out.println(score.length);
		
		//Access the value of the array
		//We can access elements of the array
		//using indexing
		System.out.println(age[0]);
		System.out.println(score[2]);
		
		System.out.println(marks[0]);
		
		boolean[] dummy = new boolean[3];
		System.out.println(dummy[0]);
		
		//Update the values in array
		age[0] = 40;
		System.out.println(age[0]);
		
		marks[0] = 18.56f;
		System.out.println(marks[0]);		
	}
}
