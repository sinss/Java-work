/*

Write a method called printDesign that produces the following output.  Use nested for  
loops to capture the structure of the figure.

-----1-----  6  i = 1 , j = 1 to 1 , k = 1 to 5 (5 times)
----333----  5  i = 3 , j = 1 to 3 , k = 2 to 5 (4 times)
---55555---  4
--7777777--  3
-999999999-  2

*/
public class work5 {
	public static void main (String args[]) {
		printDesign();
	}
	
	public static void printDesign() {
		System.out.println("print design!!");
		int c = 0;
		for (int i = 1; i <= 9; i += 2) {
			for (int k = 0 ; k < 5 - c; k++) {
				System.out.print("-");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			for (int k = 0 ; k < 5 - c; k++) {
				System.out.print("-");
			}
			/*
				c = 0 , print 6 - 0 (6)
				c = 1 , print 6 - 1 (5) ..
			*/
			System.out.print(" ");
			System.out.print(6 - c);
			System.out.println("");
			c ++;
		}
	}
}