/*
Write a method called pay that accepts two parameters: a real number for a TA's salary, 
and an integer for the number of hours the TA worked this week.  
The method should return how much money to pay the TA.  
For example the call pay(5.50, 6) should return 33.0.  --> 6 * salary
The TA should receive "overtime" pay of 1.5 times the normal salary for any hours above 8.  
For example, the call pay(4.00, 11 should return (4.00*8) + (6.00*3) or 50.0.
11 -->  8 * 4.00 + 3 * (4 * 1.5)
*/
public class work3_4
{
	public static void main(String[] args)
	{
		double result = pay(5.50, 6);
		System.out.println("pay = " + result);
		
		result = pay(4.00 , 11);
		System.out.println("pay = " + result);
		
	}
	
	public static double pay(double salary, int hours)
	{
		if (hours > 8)
		{
			return (8 * salary) + (hours - 8) * salary * 1.5;
		}
		else
		{
		// working hours less than 8 hours
			return salary * hours;
		}
	}
}