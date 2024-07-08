package core_java_examples;

import java.util.Scanner;

public class BreakStatement {
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			if(i == 10)
				break;
			System.out.println(i);
		}
		
		//infinite loop
		//we might go for infinite loop
		//where the continuation of the loop
		//depends upon the user input
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Do you want to continue(y/n)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N')
				break;
			else {
				System.out.println("Let's continue");
			}
		}
	}
}
