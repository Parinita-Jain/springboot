package core_java_examples;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle");
		
		int length = s.nextInt();
		
		System.out.println("Enter the breadth of the rectangle");
		
		int breadth = s.nextInt();
		
		System.out.println("Length = " + length);
		System.out.println("Breadth = " + breadth);
		
		System.out.println("Area = " + (length * breadth));
	}
}
