package IDFC_Practice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;  
import java.util.Set;  

public class DuplicateCharFinder {
static int count;

    public void findIt(String str) {
   
    int strLength =  str.length();
    System.out.println("Length of string: " +strLength);
   
        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
       
        char[] charArray = str.toCharArray();
       
        for (Character ch : charArray) {
            if (hmap.containsKey(ch)) {
            hmap.put(ch, hmap.get(ch) + 1);
            } else {
            hmap.put(ch, 1);
            }
        }
       
        Set<Character> keys = hmap.keySet();
       
        for (Character ch : keys) {
            if (hmap.get(ch) > 1) {
                System.out.println(ch + "  is " + hmap.get(ch) + " times");
               
            count =  hmap.get(ch);
                System.out.println("count of repeated character: "+count);
            }
        }
       
        if(strLength/2<count) {
        System.out.println("YES");
        }
        else {
        System.out.println("No");
        }
    }
   
    public static void main(String a[]) {
        DuplicateCharFinder dcf = new DuplicateCharFinder();
        dcf.findIt("India is my country");
//        dcf.findIt("tet");
       
    }
   
}