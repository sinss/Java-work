/**
 * @author Vinayak Rao
 * This program takes a pizza order, calculates subtotal, tax, and total.
 subtotal:
 tax:
 total:
 */
import java.io.IOException;
import java.util.Scanner;

public class OrderPizza
{
    private static final double COST_OF_PIZZA= 9.99;
    private static final double COST_OF_TOPPING= .99;
    private static final double COST_OF_WINGS= 5.99;
    private static final double TAX = 9.5;
    
    public static void main(String[] args)
    {
    	double total = 0;
    	double subtotal = 0;
    	double tax = 0;
        try
        {
            int pizza = readValue("How many pizzas would you like?");
            int toppings = readValue("How many toppings on each pizza?");
            int wings = readValue("How many orders of wings would you like?");
            
            subtotal = calculateSubTotal(pizza, toppings, wings);
            tax = calculateTax(subtotal);
            total = calculateTotal(subtotal, tax);
            //Put code here to CALCULATE AND PRINT subtotal, tax, and total. 
            System.out.println("Subtotal:" + subtotal);
            System.out.println("tax:" + tax);
            System.out.println("total:" + total);
        }	
        catch (Exception e)
        {
            System.out.println("Unable to place order");
        }
    }	
    
    
    /**
     *	Calculate the subtotal of the order
     *  @param numPizzas - Number of pizzas ordered
     *  @param numToppings - Number of toppings ordered
     *  @param wings - Number of wings ordered
     *  @return The subtotal
     **/
    public static double calculateSubTotal(int numPizzas, int numToppings, int numWings)
    {
        //Write a function to calculate the subtotal
        return (numPizzas * COST_OF_PIZZA) + (numToppings * COST_OF_TOPPING) + (numWings * COST_OF_WINGS);
    }
    /**
    
    */
    public static double calculateSubtotalWithoutWings(int numPizzas, int numToppings) 
    {
    	return (numPizzas * COST_OF_PIZZA) + (numToppings * COST_OF_TOPPING);
    }
    /**
    
    */
    public static double calculateWings(int wings)
    {
    	return (wings * COST_OF_WINGS);
    }
    
    /**
     *	Calculate the tax of the order
     *  @param subtotal - subtotal to calculate the tax on
     *  @return the amount of tax
     **/
     
    public static double calculateTax(double subtotal)
    {
        //Write code here to calculate the tax 
        return (TAX / 100) * subtotal;
    }
    
    /**
     *	Calculate the total of the order
     *  @param subtotal - subtotal to calculate the tax on
     *  @param tax - the amount of tax to charge
     *  @return the total of the order
     **/
     
    public static double calculateTotal(double subtotal, double tax)
    {
        // write code to calculate the total here.
        return subtotal + tax;
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