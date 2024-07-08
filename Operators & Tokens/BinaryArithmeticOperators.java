class BinaryArithmeticOperators{
	public static void main(String[] args){
		int a = 12; 
		float b = 5;

		float c = a + b; //implicit typecasting
		//here a is typecasting into float

		System.out.println(c);

		System.out.println(a-b);

		System.out.println(a*b);

		System.out.println(a/b);

		System.out.println(a%b);

		char ch1 = 'a';
		char ch2 = 'b';

		System.out.println(ch1 * ch2); 
		//implicit typecasting
		//here ch1 and ch2 are typecasting into int
		//while typecasting their ascii value is used

		boolean b1 = true;
		//boolean b2 = false;

		//System.out.println(b1+b2);

		String s1 = "hello";
		String s2 = "java";
		//concatenation
		System.out.println(s1 + s2);

		System.out.println(s1 + a);
		//implicit typecasting

		System.out.println(s1 + b1);

		int num1 = 5;
		float num2 = 10.34f;
		System.out.println("Sum = " + (num1 + num2));
	}
}





