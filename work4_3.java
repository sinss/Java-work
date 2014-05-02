/*
Write a method called smallestLargest that accepts a Scanner for the console 
as a parameter and asks the user to enter numbers, 
then prints the smallest and largest of all the numbers supplied by the user.  
You may assume that the user enters a valid number greater than 0 for the 
number of numbers to read.  
Here is a sample execution:

How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Number 5: -2
Smallest = -2
Largest = 11
*/
import java.io.IOException;
import java.util.Scanner;

public class work4_3 {
	public static void main (String args[]) {
		try {
		
			int num = readValue("how many numbers do you want to enter ?");
			
			smallestLargest(num);
		}
		catch (IOException e) {
			System.out.println("invalid entered");
		}
	}
	
	public static void smallestLargest(int num) {
		int largest = 0;
		int smallest = 0;
		//write a for loop to enter numbers that user entered
		for (int i = 1 ; i <= num ; i++) {
			try {
				int tmp =  readValue("Number " + i + ": ");
				//if the is number greater than largest number , 
				//then replace the largest number
				if (tmp > largest) {
					largest = tmp;
				}
				//if the number is less than smallest number,
				//then replace the smallest number
				if (tmp < smallest) {
					smallest = tmp;
				}
			}
			catch (IOException e) {
				System.out.println("invalid entered");
				//force to stop the programe!
				return;
			}
		}
		//print the largest and smallest number
		System.out.println("largest : " + largest);
		System.out.println("smallest : " + smallest);
	}
	
	/**
     * Reads a value in from the console, if there is an error it will return the current value
     * passed in
     * @param current - The value to return in case of an error
     * @return The value entered by the user
     */
    private static int readValue(String prompt)  throws IOException
    {
        if (!prompt.isEmpty())
        {
            System.out.println(prompt);
        }
        
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();	
    }
}