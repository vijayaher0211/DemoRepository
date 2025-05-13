package IDFC_Programs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CountOccuranceOfDuplicateWord {

	static void CountDuplicate(String str)
	{
		HashMap<String,Integer>hmap=new HashMap<String,Integer>();
		
		String array[]=str.split(" ");
		
		for(String tempstr : array)
		{
			if(hmap.containsKey(tempstr))
			{
				hmap.put(tempstr, hmap.get(tempstr)+1);
			}
			else
			{
				hmap.put(tempstr, 1);
			}
			
		}
		
///////     Using Set		
		Set<String> keys =  hmap.keySet();
		
		for(String temp : keys) {
			
			if(hmap.get(temp) ==1) {
                System.out.println(temp + "  is " + hmap.get(temp) + " times");
			}
			
		}
///////    Using Iterator
		Iterator<String> iterator=hmap.keySet().iterator();
		
		while(iterator.hasNext())
		{
			String tempstring=iterator.next();
			if((hmap.get(tempstring)) > 1)
			{
				System.out.println("Words "+ tempstring + " occurred "+hmap.get(tempstring) + " times");
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str = "I am am learning java java";
		CountDuplicate(str);

	}

}