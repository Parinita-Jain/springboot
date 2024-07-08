package mypack1;

//class can default or public
//nested class can default, public, private, protected
public class Sample2 {
	//default access - can be accessed within package
	void display() {
		System.out.println("Display of Sample 2");
		sample();
	}
	
	//public access - can be accessed anywhere
	public void demo() {
		System.out.println("Demo of Sample 2");
	}
	
	//private - can be accessed only inside the class
	private void sample() {
		System.out.println("Sample of Sample 2");
	}
	
	//protected - can be accessed within the package
	//it can be accessed outside the package also, but
	//only in the inherited(child) class
	protected void print() {
		System.out.println("Print of Sample 2");
	}
}
