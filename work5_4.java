import java.util.Random;

/*
 * Write a method called threeHeads that repeatedly flips a coin until 
 * the results of the coin toss are three heads in a row.  
 * You should use a Random object to make it equally likely that a
 *  head or a tail will appear.  
 *  Each time the coin is flipped, display H for heads or T for tails.  
 *  When three heads in a row are flipped, the method should print a congratulatory message.  
 *  Here is a possible output of a call to the method:

T T H T T T H T H T H H H
Three heads ina row!
 * */
public class work5_4 {
	static final String HEADS = "H";
	static final String TAILS = "T";
	public static void main (String[] args) {
		//count the head of a raw
		int counter = 0;
		while (counter < 3) {
			String raw = threeHeads();
			System.out.print(raw + " ");
			if (raw.equals(HEADS)) {
				counter ++;
			}
			else if (raw.equals(TAILS)) {
				counter = 0;
			}
		}
		System.out.println("");
		System.out.println("Three heads in a raw!");
	}
	
	public static String threeHeads() {
		Random rand = new Random();
		int r = rand.nextInt(2);
		if (r == 1)
			return HEADS;
		return TAILS;
	}
}
