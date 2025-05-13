package IDFC_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RepeatedCharacter {
	static int check ;

	public static void main(String[] args) {
		
		String str="test";
		int strLength = str.length();
//		System.out.println(strLength);
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		char[] charArray = str.toCharArray();
		
		for(Character ch : charArray) {
			
			if (hm.containsKey(ch)) {
            	hm.put(ch, hm.get(ch) + 1);
            } else {
            	hm.put(ch, 1);
            }
		}
		
		
		System.out.println(hm);
		
        Set<Character> keys = hm.keySet();
        
        for (Character ch : keys) {
            if (hm.get(ch) > 1) {
                System.out.println(ch + "  is " + hm.get(ch) + " times");
                check = hm.get(ch);
            }
        }
        
        for (Character ch : keys) {
            if (hm.get(ch) == 1) {
                System.out.println(ch + "  is " + hm.get(ch) + " times");
                check = hm.get(ch);
            }
        }
	}

}
