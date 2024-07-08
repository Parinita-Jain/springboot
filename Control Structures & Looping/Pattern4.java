package core_java_examples;

/*

    *
   **
  ***
 ****
*****

  	*
   * *
  * * *
 * * * *
* * * * *

 */

public class Pattern4 {
	public static void main(String[] args) {
		//outer loop
		for(int i = 1; i <= 5; i++) {
			//inner loop to print the spaces
			for(int space = 1; space <= 5-i; space++) {
				System.out.print(" ");
			}
			//inner loop to print the value(*)
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
