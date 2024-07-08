package core_java_examples;

import java.util.Scanner;

/*
 * Write a program that take a single 
 * character from the user and tells
 * whether character entered is vowel
 * or consonent
 */

public class SwitchCaseVowels {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a character... ");
		char ch = s.next().toLowerCase().charAt(0);
		
		//In the Scanner there is not function
		//to read the char value
		//so we will read the input as String 
		//using next() function and then
		//read the first character of the String 
		//using charAt(0)
		
		switch(ch) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': System.out.println("Vowel");
			  		  break;
			default: System.out.println("Consonent");
		}
	}
}
