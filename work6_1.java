/*
Write a method called lastIndexOf that accepts an array of integers and an integer value 
as its parameters and returns the last index at which the value occurs in the array.
  The method should return -1 if the value is not found.  For example,
   in the array [74,85,102,99,101,85,56], the last index of the value 85 is 5.
*/
public class work6_1 {
	public static void main (String[] args) {
		int[] values = {100, 80, 7, 74, 85, 102, 99, 101, 85, 56};
		
		int value = 85;
		int index = lastIndexOf(values, value);
		
		System.out.println("the last index of the value "+ value + " is " + index);
	}
	
	public static int lastIndexOf(int[] values, int value) {
		int index = -1;
		int counter = 0;
		for (int i : values) {
			if (i == value) {
				index = counter;
			}
			counter ++;
		}
		return index;
	}
}