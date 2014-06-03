/*
Write a method called percentEven that accepts an array of integers as a 
parameter and returns the percentage of even numbers in the array as a real number. 
 For example, if the array stores the elements[6,2,9,11,3], then  your method should return 40.0. 
  If the array contains no even elements or no elements at all, return 0.0.
*/ 
public class work6_3 {
	public static void main (String[] args) {
		int[] list1 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 99};
		int[] list2 = {19, 21, 23, 24, 27, 29, 31, 33, 35, 88};
		
		System.out.println("the percentage of event numbers in list1 is " + percentEvent(list1));
		
		System.out.println("the percentage of event numbers in list2 is " + percentEvent(list2));
	}
	
	public static double percentEvent(int[] values) {
		int eventHit = 0;
		for (int i : values) {
			if (i % 2 == 0) {
				eventHit ++;
				//eventHit = eventHit + 1
			}
		}
		double percentage = ((double)eventHit / values.length) * 100;
		
		return percentage;
	}
}