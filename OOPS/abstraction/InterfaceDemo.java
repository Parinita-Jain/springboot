package abstraction;

//in interface, we define the methods that
//the class has to implement for it to be
//identified of a particular type
//Like here any class to be called a bank class
//has to provide the implementation if deposit
//or withdraw methods

interface Bank{
	//No constructor inside the interface
	//Bank(){}
	
	//By default, all the variable declared
	//inside the interface are public, final
	//and static
	String name = "itvedant";
	
	//by default, all the method declared 
	//inside the interface are abstract 
	//and public 
	void deposit();
	void withdraw();
}

class SBIBank implements Bank{
	@Override
	public void deposit() {
		System.out.println("SBI allows deposits");
	}
	
	@Override
	public void withdraw() {
		System.out.println("SBI allows withdraw");
	}
}

class HDFCBank implements Bank{
	@Override
	public void deposit() {
		System.out.println("HDFC allows deposits");
	}
	
	@Override
	public void withdraw() {
		System.out.println("HDFC allows withdraw");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		//new Bank();
		//Bank.name = "king";
		System.out.println(Bank.name);
		
		//we can declare the object variable
		//of type interface, which can refer
		//to any object of the class that 
		//implements this interface
		Bank b = new SBIBank();
		b.deposit();
		b = new HDFCBank();
		b.deposit();
	}

}
