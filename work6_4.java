/*
Write a method called longestSortedSequence that accepts an array of integers as 
a parameter and returns the length of the longest sorted (nondecreasing) 
sequence of integers in the array.  
For example in the array [3,8,10,1,9,14,-3,0,14,207,56,98,12], 
the longest sorted sequence in the array has four values in it (the sequence -3,0,14,207),
 so your method would return 4 if passed this array.  Sorted means non decreasing , 
 so a sequence could contain duplicates.  Your method should return 0 if passed an empty array.
*/
public class work6_4 {
	public static void main (String[] args) {
		int[] list1 = {3,8,10,1,9,14,-3,0,14,207,56,98,12};
		int[] list2 = {};
		int[] list3 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 99};
		int[] list4 = {19, 21, 23, 24, 27, 29, 31, 33, 35, 30};
		
		System.out.println("the longest sequence in list1 is " + longestSortedSequence(list1));
		
		System.out.println("the longest sequence in list2 is " + longestSortedSequence(list2));
		
		System.out.println("the longest sequence in list3 is " + longestSortedSequence(list3));
		
		System.out.println("the longest sequence in list4 is " + longestSortedSequence(list4));
	}
	
	public static int longestSortedSequence(int[] values) {
		if (values.length == 0)
			return 0;
		int hit = 1;
		int value = 0;
		int maxHit = 0;
		for (int i : values) {
			if (value <= i) {
				hit ++;
				//hit = hit + 1
			}
			else {
				hit = 1;
			}
			value = i;
			if (hit > maxHit) {
				maxHit = hit;
			}
		}
		return maxHit;
	}
}