package core_java_examples;

public class BitwiseOperators {
	public static void main(String[] args) {
		int a = 26;
		int b = 19;
		
		System.out.println("Bitwise AND = " + (a & b));
		System.out.println("Bitwise OR = " + (a | b));
		System.out.println("Bitwise XOR = " + (a ^ b));
		
		System.out.println("Bitwise NOT = " + ~(a));
		System.out.println("Left Shift = " + (a << 1));
		System.out.println("Right Shift = " + (a >> 2));
		
	}
}
