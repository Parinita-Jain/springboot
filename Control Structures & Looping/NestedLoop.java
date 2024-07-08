package core_java_examples;

public class NestedLoop {
	public static void main(String[] args) {
		//outer loop
		for(int i = 1; i <= 5; i++) {
			//inner loop
			for(int j = 1; j <= 5; j++) {
				System.out.println(i);
			}
		}
	}

}
