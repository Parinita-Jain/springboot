package core_oops;

public class MethodDemo {
	
	//void return type means when the method 
	//is called, and is evaluated 
	//on returning back to the caller, it takes
	//back on value, going empty handed
	void display() {
		System.out.println("Welcome");
	}
	
	int giveNumber() {
		return 100;
	}
	
	String showMessage() {
		System.out.println("before return");
		return "good morning";
//		System.out.println("after return"); //unreachable
	}
	
	//more than one return statement in
	//the method
	String isEvenOdd(int number) {
		if(number % 2 == 0)
			return "even";
		else
			return "odd";
	}
	
	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		m.display(); //calling the method
		
		int returnedValue = m.giveNumber();
		System.out.println(returnedValue);
		
		System.out.println(m.showMessage());
		
		System.out.println(m.isEvenOdd(11));
	}
}
