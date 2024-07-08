package core_oops;

final class A{}

//final class cannot be inherited
//class B extends A{}

class A1{
	final void sample() {}
}

class A2 extends A1{
	//final method cannot be overridden
	//void sample() {}
}

class B1{
	final String name = "itvedant";
	
	//final variable can be initialized 
	//inside the constructor
	final String message;
	B1(){
		this.message = "good morning";
	}
}
public class FinalModifier {

	public static void main(String[] args) {
		B1 b = new B1();
		//final variable, value cannot be changed
		//b.name = "computer";
		
		A1 a = new A1();
		a.sample();
	}

}
