package mypack1;

//Sample1 and Sample2 are in the same package
//as that of this Class
public class AccessModifierDemo {
	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		s1.display();
		
		Sample2 s2 = new Sample2();
		s2.display();
		
		//s2.sample();
		
		s2.print();
	}
}
