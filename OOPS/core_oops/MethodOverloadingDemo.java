package core_oops;

public class MethodOverloadingDemo {
	//we are declaring multiple form of the display
	//method, but only one form will be executed
	//depending upon the value passed while
	//calling the display method
	void display(String name) {
		System.out.println("Name is " + name);
	}
	
	//invalid
//	String display(String n) {
//		
//	}
	
	void display(String n1, String n2) {
		System.out.println(n1 + " " + n2);
	}
	
	void display(int age) {
		System.out.println("Age is " + age);
	}
	
	void display(float score) {
		System.out.println("Score is " + score);
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	float add(float a, float b) {
		return a + b;
	}
	
	float add(int a, float b) {
		return a + b;
	}
	
	float add(float a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.display("leena");
		m.display(9);
		m.display(78.34f);
		m.display(7);
		m.display("good","morning");
		
		System.out.println(m.add(1, 9));
		System.out.println(m.add(9, 3));
		System.out.println(m.add(8, 2));
	}
}
