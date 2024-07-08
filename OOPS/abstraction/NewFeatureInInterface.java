package abstraction;

//Till java 7, we could declare only abstract 
//methods inside the interface
interface Drawing{
	void draw();
	
	//From java 8 onwards, we can declare default
	//method to which we can provide the
	//implementation while declaring
	
	//default keyword can be used only inside
	//interface to specify that the method contains
	//body, the access level is still public 
	
	//default need not be overridden inside
	//the child class
	default void paint() {
		canvas();
		light();
		System.out.println("Drawing is painted in white");
	}
	
	//From java 8 onwards, we can also declare 
	//static method to which we can provide the
	//implementation while declaring
	
	static void texture() {
		//canvas();
		light();
		System.out.println("Texture is matte");
	}
	
	//From java 9 onwards, we can declare private
	//methods inside the class which are accessible 
	//from within the interface only. this method
	//can be called from the default method but not
	//from the static method
	private void canvas() {
		System.out.println("Using white canvas");
	}
	
	//this method can be called from default as well as
	//static method
	private static void light() {
		System.out.println("Using bright lighting");
	}
	
}

class ScenaryDrawing implements Drawing{
	@Override
	public void draw() {
	}
}

class AbstractDrawing implements Drawing{
	@Override
	public void draw() {
	}
}

public class NewFeatureInInterface {
	public static void main(String[] args) {
		Drawing d = new ScenaryDrawing();
		//to call the default method of the 
		//interface we have create the instance
		//of the child first and then call it
		//using the reference variable
		d.paint();
		
		//to call the static method of the 
		//interface, we can use the reference
		//of the interface name
		Drawing.texture();
	}
}
