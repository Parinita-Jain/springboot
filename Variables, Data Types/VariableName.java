/*These variable naming rules are not
restricted to variables they can be applied 
on the function/method names and class name*/

class VariableName{
	public static void main(String[] args){
		/*1. Should contain letters, digits, 			     underscore, or dollar only.*/
		String name, addr1, addr2;
		String phone_number,email$address;

		/*2. Should not start with the digit*/
		//int 1marks; ==> invalid

		/*3. Should start with a letter, underscore, 			or dollar*/
		String _1marks, $2marks;
		String __, ___, ____, $;

		/*4. Reserved keywords cannot be used*/
		//String class; ==> invalid

		/*5. Names are case-sensitive*/
		int age = 10;
		int Age = 20;

		System.out.println(age);
		System.out.println(Age);

	}
}