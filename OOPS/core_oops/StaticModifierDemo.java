package core_oops;

class Sample{
	//object variable
	int cost;
	
	//static / class variable
	//there will be only one copy of the static
	//variable for the entire class
	static int rate;
	
	static void displayMessage(String message) {
		System.out.println("Message sent is " + message);
	}
	
	void display() {
		int rate = 19;
		System.out.println("Cost: " + this.cost);
		System.out.println("Rate: " + Sample.rate);
	}
}

public class StaticModifierDemo {
	
//	void nonStaticMethod() {}
	
	public static void doSomething() {
		System.out.println("Static Method in same class");
	}
	
	//JVM is able to call the main method
	//without creating the object of the class
	//containing because it is static
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.cost = 100;
		s2.cost = 500;		
		
		//static variable are accessed using
		//the class reference
		Sample.rate = 10;
		
		s1.display();
		s2.display();
		
		//avoid accessing static member using
		//object reference
		s1.rate = 20;
		
		System.out.println();
		s1.display();
		s2.display();
		
		//static methods are called using 
		//the class reference
		Sample.displayMessage("Using static modifier");
	
		Sample.displayMessage("Static Method Called");
	
		//since this method belongs to the same class
		//as that of the main(), we can skip the 
		//class name while calling it
		doSomething();
		
//		nonStaticMethod();
	}
}
