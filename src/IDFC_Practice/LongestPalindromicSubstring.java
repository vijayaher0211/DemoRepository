package IDFC_Practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LongestPalindromicSubstring {
	
	public static String LPS(String s) {
		  int n = s.length();
		  int palindromeBeginsAt = 0; //index where the longest palindrome begins
		  int max_len = 1;//length of the longest palindrome
		  boolean palindrome[][] = new boolean[n][n]; //boolean table to store palindrome truth
		  String palindromeStr[][] = new String[n][n];
		  //Trivial case: single letter palindromes
		  
//		  System.out.println("one element palindrome");
//		  for (int i = 0; i < n; i++) {
//			  System.out.println(s.charAt(i));
//			  palindrome[i][i] = true;
//		  }
		  
		  System.out.println("two element palindrome");
		  //Finding palindromes of two characters.
		  for (int i = 0; i < n-1; i++) {
		    if (s.charAt(i) == s.charAt(i+1)) {
		    	System.out.println(s.charAt(i) + s.charAt(i+1));
		      palindrome[i][i+1] = true;
		      palindromeBeginsAt = i;
		      max_len = 2;
		    }
		  }
		  
		  //Finding palindromes of length 3 to n and saving the longest
//		  for (int curr_len = 3; curr_len <= n; curr_len++) {
//		    for (int i = 0; i < n-curr_len+1; i++) {
//		      int j = i+curr_len-1;
//		      if (s.charAt(i) == s.charAt(j) //1. The first and last characters should match 
//		    	  && palindrome[i+1][j-1]) //2. Rest of the substring should be a palindrome
//		      {
//		    	palindrome[i][j] = true; 
//		        palindromeBeginsAt = i;
//		        max_len = curr_len;
//		      }
//		    }
//		  }
		  return s.substring(palindromeBeginsAt, max_len + palindromeBeginsAt);
		}

	public static void main(String args[])
	{
		System.out.println(LPS("bananas"));
//	    Scanner keyboard = new Scanner(System.in);
//	    String input = keyboard.next();
//	    System.out.println(LPS(input));
	}
}