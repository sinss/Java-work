/*
Write a method called pow that accepts a base and an exponent as parameters 
and returns the base raised to the given power.  For example, 
the call pow(3, 4) should return 3*3*3*3, or 81.  
Assume that the base and exponent are nonnegative.
*/
public class work4_2 {
	public static void main (String args[]) {
		System.out.println(pow(5,3));
	}
	
	public static int pow (int base, int times) {
		int tmp = 1;
		// int tmp = 0 --> wrong
		for (int i = 0 ; i < times ; i++ ) {
			tmp = tmp * base;
			//tmp *= base;
		}
		
		return tmp;
	}
}