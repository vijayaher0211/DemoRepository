package IDFC_Practice;

import java.util.HashMap;
import java.util.Set;

public class CountDupWords {

	public static void main(String[] args) {
		String str="I am am live in Thane Thane Thane";
		String arrOfStr[]=str.split(" ");
		int num=arrOfStr.length;
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String tempstr : arrOfStr) {
			
		if(hm.containsKey(tempstr)) {
			hm.put(tempstr, hm.get(tempstr)+1);
		}
		else
			hm.put(tempstr, 1);
		}
		
		System.out.println(hm);
		System.out.println();
		System.out.println("Duplicate characters are : ");
		
		Set<String> key = hm.keySet();
		
		for(String tempStr : key) {
			
			if(hm.get(tempStr)>1) {
				System.out.println(tempStr);
//				System.out.println(tempStr+" occurred "+ hm.get(tempStr)+" times");		
			}			
		}
		
//		System.out.println("Given String is = "+str);
//		System.out.println("Duplicate words are = ");
//		
//		for(int i=0;i<num-1;i++)
//		{
//			for(int j=0;j<num-i-1;j++)
//			{
//				if(arrOfStr[j].equalsIgnoreCase(arrOfStr[j+1])) // if(arrOfStr[j] == arrOfStr[j+1])
//				{
//					System.out.println(arrOfStr[j]);
//				}
//			}
//		}
		
	}

}