/*
Write a method called processName that accepts a Scanner for the console as a parameter 
and prompts the user to enter a full name, then prints the name in reverse order
 (i.e., last name, first name).  Here is an example dialogue with the user.

Please enter your full name: Sammy Jankis
Your name in reverse order is Jankis, Sammy
*/

import java.io.IOException;
import java.util.Scanner;

public class work3_5
{
	public static void main(String[] args)
	{
		try 
		{
			String fullName = readValue("Enter your first name and last name");
		
			System.out.println("full name : " + fullName);
			
			/*
			for (int i = fullName.length() ; i >= 1 ; i--)
			{
				System.out.print(fullName.substring(i - 1, i));
			}
			*/
			processName(fullName);
			
			System.out.println("");
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
	}
	
	public static void processName(String fullName)
	{
		//split the name by space
		//leo chang --> {"leo", "chang"}
		//leo middle chang --> {"leo", "middle", "chang"}
		String[] names = fullName.split(" ");
		//write a for loop to scan the names components
		for (int i = names.length - 1; i >= 0 ; i--)
		{
		//"leo, chang"
			if (i == 0)
			{
				System.out.print(names[i]);
			}
			else
			{
				System.out.print(names[i] + ", ");
			}
		}
	}
	
	/**
     * Reads a value in from the console, if there is an error it will return the current value
     * passed in
     * @param current - The value to return in case of an error
     * @return The value entered by the user
     */
    private static String readValue(String prompt)  throws IOException
    {
        if (!prompt.isEmpty())
        {
            System.out.println(prompt);
        }
        
        Scanner scanner = new Scanner(System.in);
        //return scanner.nextInt();
        return scanner.nextLine();	
        //return scanner.next();
    }
}