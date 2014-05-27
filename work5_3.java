import java.util.Random;

/*
 * Write a method called randomWalk that performs steps of a random one-dimensional walk. 
 *  The random walk should begin at position 0. 
 *   On each step, you should either increase or decrease the position by 1 (each with equal probability).  Your code should continue making steps until a position of 3 or -3 is reached, and then report the maximum position that was reached during the walk.  The output should look like ht following:

position=1
position=0
position=-1
position=-2
position=-1
position=-2
position=-3
max position =1
 * */
public class work5_3 {
	public static void main(String[] args) {
		int steps = 0;
		int max = steps;
		for (int i = 0 ; i < 100 ; i ++) {
			steps += randomWalk();
			//after increase / decrease each step, check the current step and max step and keep it. 
			if (max < steps)
				max = steps;
			System.out.println("position" + i + " = " + steps);
		}
		System.out.println("max position = " + max);
	}
	
	public static int randomWalk() {
		Random rnd = new Random();
		//random number 1 or 2 
		int number = rnd.nextInt(2);
		if (number == 1) {
			//if number == 1 then decrease one step
			return -1;
		}
		//if number == 2 then increase one step
		return 1;
	}
}
