import java.io.IOException;
import java.util.Scanner;

/*
Write a method called printNumbers that accepts a maximum number as an argument and 
prints each number from 1 up to that maximum, inclusive, boxed by square brackets.  
For example, consider the following calls:

printNumbers(15);
printNumbers(5);

[1] [2] [3] [4] [5]

[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15]
You may assume that the value passed to printNumbers is 1 or greater.
*/
public class work3_1
{
	public static void main(String[] args)
	{
		
		try
        {
            int numbers = readValue("input a nubmer");
            printNumbers(numbers);
        }	
        catch (Exception e)
        {
            System.out.println("Unable to place order");
        }
	}
	
	public static void printNumbers(int numbers)
	{
		if (numbers <= 1)
		{
			System.out.println("invalid number");
		}
		for (int i = 1 ; i <= numbers; i++)
		{
			System.out.print("[" + i + "] ");
		}
		System.out.println("");
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