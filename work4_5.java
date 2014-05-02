/*
Write a method called numUnique that takes three integers as parameters 
and returns the number of unique integers among the three.  
For example, the call numUnique(18, 3, 4) should return 3 because 
the parameters have three different values.  
By contrast, the call numUnique(6,7,7) should returns 2 because there are only 
two unique numbers among the three parameters: 6 and 7.
*/
public class work4_5 {
	public static void main (String args[]) {
		System.out.println("unique : " + numUnique(18, 3, 4));
		System.out.println("unique : " + numUnique(6, 7, 7));
	}
	
	public static int numUnique(int a , int b, int c) {
		int tmp = 0;
		//similar with triangle type check
		if (a == b && a == c) {
			tmp = 1;
		}
		//isosceles
		else if ( (a == b && b != c) 
		       || (a == c && c != b) 
		       || (b == c && a != c)) {
			tmp = 2;
		}
		//scalene
		else {
			tmp = 3;
		}
		return tmp;
	}
}