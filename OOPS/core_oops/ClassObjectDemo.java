package core_oops;

//class is also creating a user-defined data type
class Person{
	//State / Properties / Variables
	String name;
	int age;
	
	//Behaviour / Procedure / Method / Function
	//declare the method
	void eat(String course, String dish) {
		System.out.println(name + " is eating " 
						+ dish + " for the " + course);
	}
	
	void sleep(int hours) {
		System.out.println(name + " is sleeping for " 
						+ hours + " hours");
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
}

public class ClassObjectDemo {
	public static void main(String[] args) {
		new Person(); 
		//this will create the object of the class
		//in the memory
		//orphan object - just created but we 
		//cannot use this object in future
		
		Person p = new Person();
		//p is given data type as Person
		//indicating that it can hold the 
		//address/reference of only the object
		//of the class Person
		
		p.name = "harry";
		p.age = 19;
		
		//call the method to actually run the method
		p.eat("lunch","dal rice");
		p.sleep(9);
		p.walk();
		
		Person p1 = new Person();
		p1.name = "scott";
		p1.age = 18;
		
		p1.eat("dinner","pasta");
		p1.walk();
		p1.sleep(5);
	}
}
