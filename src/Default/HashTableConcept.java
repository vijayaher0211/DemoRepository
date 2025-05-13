package Default;

import java.util.Hashtable;

public class HashTableConcept {

	
	public static void main(String[] args) {
		
		
		Hashtable h = new Hashtable();
		
		h.put("Integer", 100);
		System.out.println(h.size());
		
		Hashtable<Integer, Integer> intHash = new Hashtable<Integer, Integer>();
		
		intHash.put(10, 01);
		
	}
	
}