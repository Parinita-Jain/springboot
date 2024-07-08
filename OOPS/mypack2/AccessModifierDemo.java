package mypack2;

//this import statement will import
//all the class files of the package mypack1
//at the runtime. So it is load even the 
//classes which might not be required in the
//current class
//import mypack1.*;

//Instead specify particular class from the 
//package to the import statement

//Sample1 class has default access level
//will be not accessible outside the package
//import mypack1.Sample1;
import mypack1.Sample2;

class Sample3 extends Sample2{
	void newDemo() {
//		super.display(); //default member
		super.demo(); //protected member
	}
}

public class AccessModifierDemo {
	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		
		//s2.display();
		
		//s2.sample();
		
		s2.demo();
		
		//s2.print();
	}
}
