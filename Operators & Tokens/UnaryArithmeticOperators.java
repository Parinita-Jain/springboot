class UnaryArithmeticOperators{
	public static void main(String[] args){
		int a = 10;

		//pre increment => 
		//first increment the value by 1 of the variable
		//then use the value of the variable
		System.out.println(++a);
		System.out.println(a);

		//post increment =>
		//first use the value of the variable
		//(before increment value)
		//then increment the actual value of the variable

		a = 10;
		System.out.println(a++);
		System.out.println(a);

		//pre decrement => 
		//first decrement the value by 1 of the variable
		//then use the value of the variable

		a = 10;
		System.out.println(--a);
		System.out.println(a);

		//post decrement =>
		//first use the value of the variable
		//(before decrement value)
		//then decrement the actual value of the variable

		a = 10;
		System.out.println(a--);
		System.out.println(a);
	}
}