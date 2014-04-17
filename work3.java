/*
#3 - Chapter 2, Pg. 129 #7

Write nested for loops to produce the following output:

        1 i = 1, j = 4 to 1 (four times)
      2
    3
  4 i = 4, j = 4 to 4 (one times)
5  i = 5, j = none (zero times)
*/
public class work3 {
	public static void main (String args[]) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j --) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
	}
}
