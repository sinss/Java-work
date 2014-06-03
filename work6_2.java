/*
Wrote a method called isSorted that accepts an array of real numbers as a
 parameter and returns true if the list is in sorted (nondecreasing) order and false otherwise. 
  For example, if arrays named list2 and list2 store [16.1, 12.3,22.2,14.4] 
  and [1.5, 4.3, 7.0,19.5,25.1, 46.2] respectively, the calls isSorted(list1) 
  and isSorted(list2) should return false and true respectively.  
  Assume the array has at least one element.  A one-element array is considered to be sorted.
*/
public class work6_2 {
	public static void main (String[] args) {
		double[] list1 = {10, 11, 12, 13, 14, 15, 16, 17};
		double[] list2 = {10, 11, 12, 13, 14, 15, 16, 17, 16};
		
		if (isSorted(list1)) {
			System.out.println("list1 is ascending");
		}
		else {
			System.out.println("list1 isn't ascending");
		}
		
		if (isSorted(list2)) {
			System.out.println("list2 is ascending");
		}
		else {
			System.out.println("list2 isn't ascending");
		}
	}
	
	public static boolean isSorted(double[] list) {
		//to check the list is in ascending (nondecreasing)
		double lastValue = 0.0;
		int counter = 0;
		for (double d : list) {
			if (counter > 0)
			{
				if (lastValue > d) {
				//not ascending
					return false;
				}
			}
			lastValue = d;
			counter ++;
		}
		return true;
	}
}