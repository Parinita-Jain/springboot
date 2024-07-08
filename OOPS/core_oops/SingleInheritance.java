package core_oops;

class Parent{
	
	Parent(){
		super();
		System.out.println("Parent Class Constructor");
	}
	
	void display() {
		System.out.println("Display Method of Parent Class");
	}
	
	void demo() {
		System.out.println("Demo Method of Parent Class");
	}
}

//extends keyword is used to show
//that the Child class will inherit the
//properties and methods of the Parent Class

//Child is not empty, it is getting display()
//from the Parent
class Child extends Parent{
	
	//From the Child Class constructor
	//called is placed to the Parent Class constructor
	Child(){
		super() ; //this statement is added by the compiler
				//to place the call to the parent class constructor
		System.out.println("Child Class Constructor");
	}
	
	//@Override annotation is for the compiler,
	//so that compiler is aware that this function
	//is overridden function so that compiler can
	//check whether it is following the rules of the
	//overridding
	@Override
	void display() {
		//here super keyword is used to call
		//the parent class method
		super.demo();
		System.out.println("Display Method of Child Class");
		super.display();
	}
	
}

public class SingleInheritance {
	public static void main(String[] args) {
		//here the constructor of the Child class
		//is called
		Child c = new Child();
		c.display();
	}
}
