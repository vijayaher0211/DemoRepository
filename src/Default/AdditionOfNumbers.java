package Default;

import java.util.Scanner;

public class AdditionOfNumbers {

	
	private static long sum;
	
	    static long solveMeFirst(long a, long b) {
	    	sum = a+b;
	    	return sum;
	   }

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        long a;
	        a = in.nextInt();
	        long b;
	        b = in.nextInt();
//	        int sum;
	        sum = solveMeFirst(a, b);
	        System.out.println("sum is: "+sum);
	   }
	}
