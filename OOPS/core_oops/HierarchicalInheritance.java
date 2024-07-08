package core_oops;

class Shape{
	void area() {
		System.out.println("Calculate Area");
	}
}

class Rectangle extends Shape{
	
}

class Triangle extends Shape{
	
}

class Circle extends Shape{
	
}

class Square extends Shape{
	
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area();
		
		Square s = new Square();
		s.area();
	}

}
