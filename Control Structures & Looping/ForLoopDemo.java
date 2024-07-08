package core_java_examples;

public class ForLoopDemo {
	public static void main(String[] args) {
		//Since we want the print statement
		//to be execute multiple times
		//we will create a loop that will make
		//the statement run rather than programmer
		//writing it multiple times
//		for(int i = 1; i<=10 ;i++) {
//			System.out.println(i + " - Welcome to Java");
//		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
