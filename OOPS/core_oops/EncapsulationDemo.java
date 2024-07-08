package core_oops;

//Encapsulation is wrapping the data
//and methods inside the class
//Because of encapsulation, we can implement
//data/method hiding using access modifiers
//where that data/method can be hidden using
//access level like private, default, protected
//and these members can be made accessible 
//using access level like public
class Employee{
	private String name;
	private int id;
	private float salary;
	
	private void sample() {
		
	}
	
	
	public Employee(String name, int id, float salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		sample();
	}
	
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Salary: " + this.salary);
	}
	
	//mutators methods (methods which will
	//change/update the value of the variables
	//also called setter methods
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	//accessor methods (methods which will
	//read the value of the variables
	//also called getter methods
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public float getSalary() {
		return this.salary;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee e = new Employee("leena", 23, 14000f);
		
		e.display();
		
		e.setSalary(19000f);
		
		e.display();
		
		System.out.println(e.getId());
		
	}
}
