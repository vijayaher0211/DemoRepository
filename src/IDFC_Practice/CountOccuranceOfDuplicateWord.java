package IDFC_Practice;
import java.util.HashMap;
import java.util.Iterator;

public class CountOccuranceOfDuplicateWord {

	static void CountDuplicate(String str)
	{
		HashMap<String,Integer>hmap=new HashMap<String,Integer>();
		String array[]=str.split(" ");
		for(String tempstr:array)
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
		System.out.println(hmap);
		
		Iterator<String> iterator=hmap.keySet().iterator();
		while(iterator.hasNext())
		{
			String tempstring=iterator.next();
			if((hmap.get(tempstring)) > 1)
			{
				System.out.println("Word "+tempstring + " Count = "+hmap.get(tempstring));
			}
		}
		
	}
	public static void main(String[] args) {
		CountDuplicate("I am am learning java java");

	}

}