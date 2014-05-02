/*
Write a method called repl that accepts a String and a number of repetitions as 
parameters and returns the String concatenated that many times.  For example, 
the call repl("hello", 3) should return "hellohellohello".  
If the number of repetitions is zero or less, the method should return an empty string.
*/
public class work4_1 {
	public static void main (String args[]) {
	
		System.out.println(repl("leo",5));
		
	}
	
	public static String repl(String str, int times) {
		Strimg tmp = "";
		for (int i = 0 ; i < times; i++) {
			tmp = tmp + str;
			//tmp += str;
		}
		return tmp;
	}
}