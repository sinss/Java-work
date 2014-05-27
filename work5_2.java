import java.util.Random;

/*
 * 
 * Write a method called randomLines that prints between 5 and 10
 *  random strings of letters (between "a" and "z"), one per line.  
 *  Each string should have random length of up to 80 characters.
 * */
public class work5_2 {
	public static void main(String[] args) {
		randomLines(10);
	}
	
	public static void randomLines(int number_of_lines) {
		//the random strings pool
		String pool = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		String sb = "";
		   for( int i = 0; i < number_of_lines; i++ ) {
			   sb += pool.charAt( rnd.nextInt(pool.length()) ) ;
		   }
		       
		   System.out.println("result : " + sb);
	}
}
