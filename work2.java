/*

#2 - Chapter 2, Pg. 128 #5

Write nested for loops to produce the following output:

* i = 1 , j = 1 to 1
** i = 2 , j = 1 to 2
*** 
****
***** i = 5 , j = 1 to 5 

*/
public class work2 {
	public static void main (String args[]) {
		for (int i = 1 ; i <=5 ; i++) {
			for (int j = 1 ; j <= i; j ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}