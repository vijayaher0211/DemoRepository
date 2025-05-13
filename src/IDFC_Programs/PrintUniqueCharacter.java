package IDFC_Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintUniqueCharacter {
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter input: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		LinkedHashMap<Character, Integer> list = new LinkedHashMap<Character, Integer>();
		for(Character c : s.toCharArray())
		{
			if(list.containsKey(c))
			{
				list.put(c, list.get(c)+1);
			}
			else
			{
				list.put(c, 1);
			}
		}
		for(Map.Entry e: list.entrySet())
		{
			if((int)e.getValue() == 1)
				System.out.println(e.getKey());
		}
	}
	
	
	
/*    static int NO_OF_CHARS = 256; 
       
     Print duplicates present in the passed string 
    static void printDistinct(String str) 
    { 
        // Create an array of size 256 and count of 
        // every character in it 
        int[] count = new int[NO_OF_CHARS]; 
       
         Count array with frequency of characters 
        int i; 
        
        for (i = 0; i < str.length(); i++)
            if(str.charAt(i)!=' ') 
                count[(int)str.charAt(i)]++; 
        
        int n = i; 
       
        // Print characters having count more than 0 
        for (i = 0; i < n; i++) 
            if (count[(int)str.charAt(i)] == 1) 
                System.out.print(str.charAt(i)); 
    } 
       
     Driver program
    public static void main(String args[]) 
    { 
        String str = "test"; 
        printDistinct(str); 
    } */
	
	
}
