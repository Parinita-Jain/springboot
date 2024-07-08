package abstraction;

//Abstraction is hiding the functionality
//of the class that means we can hide the
//implementation of the method by declaring
//a method as abstract

//If a class contains an abstract method
//the class itself has to be declared abstract

abstract class Shape{
	Shape(){}
	
	abstract void area();
	
	//non-abstract
	void paint() {
		System.out.println("Paint the shape");
	}
}

//Child of the abstract has to override all the
//abstract methods of the Parent class
class Rectangle extends Shape{
	@Override
	void area() {
		System.out.println("Area of the rectangle");
	}
}

class Square extends Shape{
	@Override
	void area() {
		System.out.println("Area of the square");
	}
}

abstract class Polygon extends Shape{}

public class AbstractModifierDemo {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.area();
		
		s = new Square();
		s.area();
		
		//we cannot create the object of the abstract
		//class
		//new Shape();
	}

}
