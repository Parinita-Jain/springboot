package core_java_examples;

/*

*****
****
***
**
*
Reverse Right Angle Triangle
 */

public class Pattern3 {
	public static void main(String[] args) {
		//outer loop
		for(int i = 5; i >= 1; i--) {
			//inner loop
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
