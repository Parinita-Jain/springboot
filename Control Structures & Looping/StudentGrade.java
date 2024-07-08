package core_java_examples;

import java.util.Scanner;
/*
 * Write a program to find the grade of the student
 * based on the aggregate marks that the student
 * has achieved. The grades will be assigned based on the
 * following chart:
 * 
 * Aggregate		Grade
 * >= 75			A
 * 75 - 60			B
 * 60 - 45			C
 * < 45				D
 * 
 * Aggregate values should lie between 100 and 0
 * 
 */

public class StudentGrade {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your aggregate marks => ");
		float marks = s.nextFloat();
		
		if(marks <= 100 && marks >= 75) {
			System.out.println("Grade A");
		}
		else if(marks < 75 && marks >= 60) {
			System.out.println("Grade B");
		}
		else if(marks < 60 && marks >= 45) {
			System.out.println("Grade C");
		}
		else if(marks < 45 && marks >= 0) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
}
