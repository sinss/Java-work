/*
Write a method called largerAbsVal that takes two integers as parameters and returns 
the larger of the absolute values.  A call of largerAbsVal(11, 2) would return 11, 
and a call of largerAbsVal(4,-5) would return 5.
*/
public class work3_2
{
	public static void main(String[] args)
	{
		int larger = largerAbsVal(11, 2);
		System.out.println("Larger = " + larger);
	}
	
	public static int largerAbsVal(int number1, int number2)
	{
		//check the number and number (must get the absolute values first)
		if (Math.abs(number1) > Math.abs(number2))
		{
			return Math.abs(number1);
		}
		else
		{
			return Math.abs(number2);
		}
	}
}