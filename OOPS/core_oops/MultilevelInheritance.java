package core_oops;

//Food - 1 method
class Food{
	Food(){
		System.out.println("Food Class Constructor");
	}
	
	void message() {
		System.out.println("Food Class");
	}
}

//Snacks - 1 method inherited + 1 method = 2
class Snacks extends Food{
	Snacks(){
		System.out.println("Snacks Class Constructor");
	}
	
	Snacks(float calories){
		this();
		System.out.println("Parameterized Constructor");
	}
	
	void calculateCalories() {
		System.out.println("Count Calories");
	}
}

//PaniPuri - 2 method inherited
class PaniPuri extends Snacks{
	PaniPuri(){
		//here the programmer will specify the 
		//which constructor of the Parent class is to be 
		//called using super keyword
		//this statement should be the first statement
		//in the constructor
		super(67.45f);
		System.out.println("PaniPuri Class Constructor");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		PaniPuri p = new PaniPuri();
		p.message();
		p.calculateCalories();
		
		Food f = new PaniPuri();
	}
}
