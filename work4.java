/*
Write nested for loops to produce the following output:

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
1. print three lines words
2. zero to nine
3. print number three times
*/
public class work4 {
	public static void main (String args[]) {
		for (int i = 0 ;i < 3; i ++ ) {
			for (int j = 0 ; j <= 9 ; j++) {
				for (int k = 0 ; k < 3; k++) {
				//000111222333....999
					System.out.print(j);
				}
			}
			System.out.println("");
		}
	}
}
