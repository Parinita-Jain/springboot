package core_oops;

class Bank{
	void deposit() {
		System.out.println("Bank allows deposits");
	}
	
	void withdraw() {
		System.out.println("Bank allows withdraws");
	}
}

class SBIBank extends Bank{
	@Override
	void deposit() {
		System.out.println("SBI Bank allows deposits");
	}
	
	@Override
	void withdraw() {
		System.out.println("SBI Bank allows withdraws");
	}
	
	void insurance() {
		System.out.println("SBI Bank allows insurance");
	}
}

class HDFCBank extends Bank{
	@Override
	void deposit() {
		System.out.println("HDFC Bank allows deposits");
	}
	
	@Override
	void withdraw() {
		System.out.println("HDFC Bank allows withdraws");
	}
	
	void loan() {
		System.out.println("HDFC Bank allows loans");
	}
}

class AxisBank extends Bank{
	@Override
	void deposit() {
		System.out.println("Axis Bank allows deposits");
	}
	
	@Override
	void withdraw() {
		System.out.println("Axis Bank allows withdraws");
	}
}

public class DynamicPolymorphism {
	public static void bankOperation(Bank b) {
		System.out.println("\nBank Operations");
		b.withdraw();
		b.deposit();
		//instanceof operator which returns a boolean value
		//to specify whether the reference variable 
		//is referring to the object of the class specified 
		if(b instanceof HDFCBank)
			((HDFCBank)b).loan();
		if(b instanceof SBIBank)
			((SBIBank)b).insurance();			
	}
	
	public static void main(String[] args) {
		//here bank1 variable can refer to the object of 
		//just SBIBank class as its type is specified as
		//SBIBank
//		SBIBank bank1 = new SBIBank();
//		bank1.withdraw();
//		bank1.deposit();
		
		//here bank2 variable can refer not only its
		//own object but also the object of its child 
		//classes
		Bank bank2 = new HDFCBank();
		bank2.withdraw();
		bank2.deposit();
		((HDFCBank)bank2).loan(); //downcasting
		
		bank2 = new SBIBank();
		bank2.withdraw();
		//((HDFCBank)bank2).deposit(); //at this statement
		//ClassCastException will be raised by JVM
		//as we converted the object into the wrong class type
		((SBIBank)bank2).insurance(); //downcasting
		
		
		bankOperation(new HDFCBank());
		bankOperation(new SBIBank());
		bankOperation(new AxisBank());
	}
}
