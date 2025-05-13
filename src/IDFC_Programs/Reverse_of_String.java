package IDFC_Programs;

import java.util.Scanner;

public class Reverse_of_String {

	public static void main(String[] args) {
		
		String str="I am Learning java";
		
		String strarray [] = str.split(" ");
		
		System.out.println("Reverse of String :");
		
		for(int i=strarray.length-1;i>=0;i--)
		{
			System.out.print(strarray[i]+" ");
		}
		
	}

}