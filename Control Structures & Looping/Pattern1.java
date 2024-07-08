package core_java_examples;

/*
11111 ==> row 1 ==> value 5
22222 ==> row 2 ==> value 5
33333 ==> row 3 ==> value 5
44444 ==> row 4 ==> value 5
55555 ==> row 5 ==> value 5

12345
12345
12345
12345
12345

Number of rows in the pattern can be used to 
decide the number of times outer loop is to be
executed

Number of the values to be printed on each row
can be used to decide the number of times inner 
loop is to be executed for every outer loop
iteration
 */

public class Pattern1 {
	public static void main(String[] args) {
		//outer loop
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
