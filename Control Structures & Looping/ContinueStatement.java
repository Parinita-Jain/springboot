package core_java_examples;

public class ContinueStatement {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i == 5 || i == 7)
				continue; 
				//all the upcoming statements inside
				//loop will be skipped
			System.out.println(i);
		}
	}
}
