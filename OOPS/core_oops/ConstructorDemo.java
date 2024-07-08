package core_oops;

//In Student, we have not created any
//constructor method, compiler will notice
//this at the translation and will create
//a constructor implicitly and place it
//inside the class
//constructor created by the compiler is 
//called default constructor
//even default constructor is no having
//any parameters
class Student{
	int id; //0
	String name; //null
}

class Course{
	//same name as that of the class
	//will have no return type
	//compiler will not create the constructor
	//this constructor is called no-arg constructor
	Course(){
		System.out.println("Constructor Called");
	}
}

class Teacher{
	//same name as that of the class
	//will have no return type
	//compiler will not create the constructor
	//this constructor is called parameterized constructor
	Teacher(String name, String subject){
		System.out.println("Parameterized Constructor " 
						+ "with values "
						+ name + " " + subject );
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		//constructor is called when we create
		//the object of the class
		Student s = new Student();
		
		Course c1 = new Course();
		Course c2 = new Course();
		
		Teacher t = new Teacher("harry","java");
		Teacher t1 = new Teacher("scott","python");
	}
}
