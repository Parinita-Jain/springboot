package core_oops;

class Customer{
	//Properties
	//Every object will get its own copy of the
	//properties defined
	String name;
	String email;
	
	//Constructor overloading means
	//declaring multiple constructor for the 
	//class but each constructor should have
	//a different parameter
	Customer(){
		System.out.println("No Arg Constructor");
		name = "no one";
		email = "no email";
	}
	
	//here name is local parameter of the constructor
	//whereas this.name is referring to the object
	//whose name will be set
	Customer(String name){
		System.out.println("One Argument Constructor");
		this.name = name;
		this.email = "no email";
	}
	
	Customer(String name, String email){
		System.out.println("Two Argument Constructor");
		this.name = name;
		this.email = email;
	}
	
	void display() {
		//local variable of the method
		String name = "someone";
		String email = "someone@gmail.com";
		System.out.println("Local Variables");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		
		//this means refer the object on 
		//which display method is called and
		//this.name will refer the name of the
		//object and not the local variable name
		System.out.println("Object Variables");
		System.out.println("Name: " + this.name);
		System.out.println("Email: " + this.email);
	}
}


public class ConstructorOverloading {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer("harry");
		Customer c3 = new Customer("jim", "jim@gmail.com");
		
		c1.display();
		c2.display();
	}
}
