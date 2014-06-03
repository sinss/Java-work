/*
Write a method called append that accepts two integer arrays as parameters and 
returns a new array that contains the result of appending the second array's 
values at the end of the first array.  For example, 
if arrays list1 and list2 store[2,4,6] and [1,2,3,4,5] respectively, 
the call of append(list1,list2) should return a new array containing[2,4,6,1,2,3,4,5]. 
 If the call instead had been append(list2, list1),
  the method would return an array containing [1,2,3,4,5,2,4,6].
*/
public class work6_5 {
	public static void main (String[] args) {
		int[] first = {2,4,6};
		int[] second = {1,2,3,4,5};
		
		printArray(first);
		printArray(second);
		
		int[] newArray = append(first, second);
		
		printArray(newArray);
		
		System.out.println(newArray.toString());
	}
	
	public static int[] append(int[] a1, int[] a2) {
		int[] newArray = new int[a1.length + a2.length];
		int index = 0;
		for (int i : a1) {
			newArray[index] = i;
			index ++;
		}
		for (int i : a2) {
			newArray[index] = i;
			index ++;
		}
		return newArray;
	}
	
	public static void printArray(int[] a) {
		System.out.print("[");
		for (int i : a) {
			System.out.print(i + ", ");
		}
		
		System.out.print("]");
		System.out.println("");
	}
}