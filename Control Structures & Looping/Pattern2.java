package core_java_examples;

/*
1		==> row 1	==> values 1
22		==> row 2	==> values 2
333		==> row 3	==> values 3
4444	==> row 4	==> values 4
55555	==> row 5	==> values 5

1
12
123
1234
12345

*
**
***
****
*****
 */

public class Pattern2 {
	public static void main(String[] args) {
		//outer loop
		for(int i = 1; i <= 5; i++) {
			//inner loop
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
