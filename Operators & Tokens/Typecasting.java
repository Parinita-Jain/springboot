package core_java_examples;

public class Typecasting {
	public static void main(String[] args) {
		int a = 10;
		float b = 5;
		
		System.out.println(a / b); //implicit typecasting
		
		byte b1 = 34;
		int i = b1; //implicit typecasting
		
		char ch = 'b';
		int chi = ch; //implicit typecasting
		
		System.out.println(chi);
		
		int marks = 89;
		float fmarks = marks;
		
		System.out.println(fmarks);
		
		///////////////////////////////////
		
		int asciiValue = 104;
		char asciiChar = (char)asciiValue;
		//explicit typecasting
		
		System.out.println(asciiChar);
		
		float score = 8743.3453f;
		int iScore = (int)score;
		
		long phone = 8394888394L;
		int iPhone = (int)phone;
		
		System.out.println(iScore);
		System.out.println(iPhone);
	}
}
