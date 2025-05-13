package ListConcept;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		
		LinkedList<String > ll = new LinkedList<String>();
		
		ll.add("name");
		ll.add("Vijay");
		ll.add("Test");
		ll.add("Array");
		ll.add("LinkedList");
		System.out.println(ll);
		
		ll.add(0, "Babu");
		System.out.println(ll);
		
		ll.addFirst("naveen");
		System.out.println(ll);
		
		ll.remove();
		System.out.println(ll);
		
		ll.add(5, "jdyuavd");
		System.out.println(ll);

		
		
	}

}
