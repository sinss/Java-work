/*
Write a method called lastDigit that returns the last digit of an integer.  
For example lastDigit(3572) should return 2.  It should work for negative numbers as well.
  For example, lastDigit(-947) should return 7.
*/
public class work3_3
{
	public static void main(String[] args)
	{
		int result = lastDigit(-947);
		
		System.out.println("last digit = " + result);
		
		result = lastDigit(3572);
		
		System.out.println("last digit = " + result);
	}
	
	public static int lastDigit(int number)
	{
	//7 % 10 = 7
	//104 % 10 = 4 
		//return Math.abs(number) % 10;
		return Math.abs(number % 10);
	}
}