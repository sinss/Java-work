/*
 * Write a method called showTwos that shows the factors of 2 in a given integer. 
 *  For example, consider the following calls:

showTwos(7);
showTwos(18);
showTwos(68);
showTwos(120);

These calls should produce the following output:

7 = 7
18 = 2*9
68 = 2*2*17
120 = 2*2*2*15
 * */
public class work5_1 {
	public static void main(String[] args) {
		showTwos(18);
		showTwos(68);
		showTwos(120);
	}
	
	/**
	 * find the factor of the number
	 * */
	public static void showTwos(int number) {
		System.out.print(number + " = ");
		int mod = 0, left = number;
		while (true) {
			mod = left % 2;
			if (mod == 0) {
				left = left / 2;
				System.out.print("2");
			}
			else {
				System.out.print(left);
				//if the left number can't divide by 2, the leave the while loop
				break;
			}
			System.out.print("*");
		}
		System.out.println("");
	}
}
