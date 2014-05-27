/*
 * Wrte a method called firstDigit that returns the first (most significant) 
 * digit of an integer.  For example, firstDigit(3572) should return 3.  
 * It should work for negative numbers as well; firstDigit(-947) should return 9
 * */
public class work5_5 {
	static final int UNIT = 10;
	public static void main(String[] args) {
		int r1 = firstDigit(3572);
		int r2 = firstDigit(-947);
		System.out.println("firstDigit(3572) = " + r1);
		System.out.println("firstDigit(-947) = " + r2);
	}
	
	public static int firstDigit(int number) {
		int left = Math.abs(number);
		int mod = 0;
		while (left > UNIT) {
			left = left / UNIT;
			mod = left % UNIT;
		}
		return mod;
	}
}
