package abstraction;

//outer class
class Student{
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	//inner class / nested class
	class Address{
		String city;
		String state;
		int pinCode;
		
		public Address(String city, String state, int pinCode) {
			this.city = city;
			this.state = state;
			this.pinCode = pinCode;
		}
		
		//all the members of the outer class
		//are accessible to the inner class
		public void display() {
			System.out.println("Name: " + name);
			System.out.println("Roll No: " + rollNo);
			System.out.println("City: " + city);
			System.out.println("State: " + state);
			System.out.println("Pin Code: " + pinCode);
		}
	}
	
	class Qualification{}
}

public class NestedClassDemo {
	public static void main(String[] args) {
		//to create the instance of the inner class
		//first we will have to create the instance of 
		//outer class
		
		Student s = new Student(1,"leena");
		
		//Then we create the instance of the inner class
		//by using the reference variable of the outer class
		
		Student.Address addr = 
				s.new Address("mumbai","maha",400023);
		
		addr.display();
	}
}
