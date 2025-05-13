package TestPackage;

import java.util.Scanner;

public class CodingBat {

//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		String name = sc.nextLine();		
//		
//		helloName(name);
//		sc.close();
//	}
//	
//	
//	public static String helloName(String name) {
//		
//		return "Hello "+ name;
//	}	
	
//	public static String makeOutWord(String out, String word) {
//		 
//		 int outLength = out.length();
//		 int wordLength = word.length();
//		 
//		 char outChar[] = out.toCharArray();
//		 System.out.println(outChar[1]);
//		 System.out.println(outChar[0]);
//		 System.out.println(outChar[2]);
//		 System.out.println(outChar[3]);
//
//		 
//		 System.out.println(outChar[0]+""+outChar[1]+"word"+outChar[2]+outChar[3]);
//		 
//		  return out;
//		}
	
//	public static void main(String[] args) {
//		makeOutWord("<<>>","b");
//	}
	
	
	
	/*
	 * Given a string, return a new string made of 3 copies of the last 2 chars of
	 * the original string. The string length will be at least 2.
	 * 
	 * extraEnd("Hello") → "lololo" 
	 * extraEnd("ab") → "ababab" 
	 * extraEnd("Hi") → "HiHiHi"
	 */
	
	public static void main(String[] args) {
		
		extraEnd("Hi");
		
	}
	
	public static String extraEnd(String str) {
		  
//		  System.out.println(str.length());
		  
		  char ch[] = str.toCharArray();
		  
//		  String output = ch[ch.length-2] +""+ ch[ch.length-1];
		  
		  String output = str.substring(str.length()-2);

		  String finalString = output+output+output;
		  System.out.println(finalString);
		  
		  return "";
	}



}
