/**
 * Represents a tic tac toe board on the console, positions are shown below:
 * -------------
 * | 1 | 2 | 3 |
 * -------------
 * | 4 | 5 | 6 |
 * -------------
 * | 7 | 8 | 9 |
 * -------------
 * 
 * 
 * An example board in mid play looks like this:
 * -------------
 * | X |   |   |
 * -------------
 * |   | O |   |
 * -------------
 * | O |   | X |
 * -------------
 * 
 * @author Vinayak Rao
 *
 */
import java.io.IOException;
import java.util.Scanner;
public class TicTacToe
{
    public enum Marker
    {
        EMPTY,
        X,
        O;
        /**/
        @Override
        public String toString() 
        {
        	switch (this) 
        	{
        		case EMPTY:
        			return "   ";
        		case X:
        			return " X ";
        		case O:
        			return " O ";
        	}
        	return "   ";
        }
    };
    
    private static Marker position1 = Marker.EMPTY;
    private static Marker position2 = Marker.EMPTY;
    private static Marker position3 = Marker.EMPTY;
    private static Marker position4 = Marker.EMPTY;
    private static Marker position5 = Marker.EMPTY;
    private static Marker position6 = Marker.EMPTY;
    private static Marker position7 = Marker.EMPTY;
    private static Marker position8 = Marker.EMPTY;
    private static Marker position9 = Marker.EMPTY;
    
    private static Marker turn = Marker.X;
   
    /**
      * This function returns true if the spot is empty, false if not.
      */
    public static boolean isValidMove(int pos)
    {
    	Marker check = Marker.EMPTY;
    	switch (pos) {
    		case 1:
				check = position1;
    			break;
    		case 2:
    			check = position2;
    			break;
    		case 3:
    			check = position3;
    			break;
    		case 4:
    			check = position4;
    			break;
    		case 5:
    			check = position5;
    			break;
    		case 6:
    			check = position6;
    			break;
    		case 7:
    			check = position7;
    			break;
    		case 8:
    			check = position8;
    			break;
    		case 9:
    			check = position9;
    			break;
    		default:
    			return false;
    	}
    	if (check == Marker.EMPTY) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * This method will print the board as shown in the above example.
     */
    public static void printBoard()
    {
    	System.out.println("-------------");
    	System.out.print("|");
    	System.out.print(position1.toString());
    	System.out.print("|");
    	System.out.print(position2.toString());
    	System.out.print("|");
    	System.out.print(position3.toString());
    	System.out.print("|");
    	System.out.println("");
    	System.out.println("-------------");
    	System.out.print("|");
    	System.out.print(position4.toString());
    	System.out.print("|");
    	System.out.print(position5.toString());
    	System.out.print("|");
    	System.out.print(position6.toString());
    	System.out.print("|");
    	System.out.println("");
    	System.out.println("-------------");
    	System.out.print("|");
    	System.out.print(position7.toString());
    	System.out.print("|");
    	System.out.print(position8.toString());
    	System.out.print("|");
    	System.out.print(position9.toString());
    	System.out.print("|");
    	System.out.println("");
    	System.out.println("-------------");
    }
    
    /**
     * Checks if a particular player has won.
     * 
     * @param m The player to check
     * @return true if the player won, false if not
     */
    public static boolean hasWon(Marker m)
    {
    /*
    1,2,3
 	4,5,6
 	7,8,9
 	1,4,7
 	2,5,8
 	3,6,9
 	1.5.9
 	3.5.7
    */
    	if (position1 == m && position2 == m && position3 == m) {
    		return true;
    	}
    	else if (position4 == m && position5 == m && position6 == m) {
    		return true;
    	}
    	else if (position7 == m && position8 == m && position9 == m) {
    		return true;
    	}
    	else if (position1 == m && position4 == m && position7 == m) {
    		return true;
    	}
    	else if (position2 == m && position5 == m && position8 == m) {
    		return true;
    	}
    	else if (position3 == m && position6 == m && position9 == m) {
    		return true;
    	}
    	else if (position1 == m && position5 == m && position9 == m) {
    		return true;
    	}
    	else if (position3 == m && position5 == m && position7 == m) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * Checks if the board is full with no winner
     * @return true if the board is full with no winner, false otherwise
     */
    public static boolean isTie()
    {
    	if (position1 != Marker.EMPTY &&
    		position2 != Marker.EMPTY &&
    		position3 != Marker.EMPTY &&
    		position4 != Marker.EMPTY &&
    		position5 != Marker.EMPTY &&
    		position6 != Marker.EMPTY &&
    		position7 != Marker.EMPTY &&
    		position8 != Marker.EMPTY &&
    		position9 != Marker.EMPTY) {
    		return true;
    	}
    	return false;
    }
   
    /**
     * Mark the given position with the given marker
     * @param m The marker of the player given
     * @param pos The position that we are marking
     */
    
    public static void markTheBoard(Marker m, int pos)
    {
    	switch (pos) {
    		case 1:
				position1 = m;
    			break;
    		case 2:
    			position2 = m;
    			break;
    		case 3:
    			position3 = m;
    			break;
    		case 4:
    			position4 = m;
    			break;
    		case 5:
    			position5 = m;
    			break;
    		case 6:
    			position6 = m;
    			break;
    		case 7:
    			position7 = m;
    			break;
    		case 8:
    			position8 = m;
    			break;
    		case 9:
    			position9 = m;
    			break;
    	}
    }
    
    public static void main(String[] args) {
    
    	//test the toString() method
    	System.out.println("test:" + Marker.EMPTY.toString());
    	System.out.println("test:" + Marker.X.toString());
    	System.out.println("test:" + Marker.O.toString());
    
    	int counter = 0;
    	System.out.println("Enter \"999\" to leave the game");
    	while (true) {
    		try {
    			int position = -1;
    			if (counter % 2 == 0) {
    				turn = Marker.X;
    				position = readValue("Player X ,please enter a position to play");
    			}
    			else if (counter % 2 == 1) {
	    			turn = Marker.O;
    				position = readValue("Player O ,please enter a position to play");
    			}
    			if (position == 999) {
    				System.out.println("Game Over");
    				break;
    			}
    			if (isValidMove(position)) {
    				markTheBoard(turn, position);
    				printBoard();
    				counter ++;
    			}
    			else {
    				System.out.println("Invalid turn");
    			}
    			/*
    			check if anyone has wan!
    			*/
    			if (hasWon(Marker.X)) {
    					System.out.println("Player X has wan!");
    					break;
    			}
    			if (hasWon(Marker.O)) {
    					System.out.println("Player O has wan!");
    					break;
    			}
    			if (isTie()) {
    				System.out.println("No one has won!");
    				break;
    			}
    		}
    		catch (Exception e) {
    			System.out.println("Invalid turn");
    		}
    	}
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
        //return scanner.nextLine();	
        //return scanner.next();
    }
}