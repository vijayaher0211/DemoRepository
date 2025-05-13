package IDFC_Programs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountOccuranceOfCharacter {
	public static void countcharacter( String str)
	{
		HashMap<Character,Integer>hmap=new HashMap<Character,Integer>();
		char chararray[]=str.toCharArray();
		for(char tempchar:chararray)
		{
			if(hmap.containsKey(tempchar))
			{
				hmap.put(tempchar, hmap.get(tempchar)+1);
			}
			else
			{
				hmap.put(tempchar, 1);
			}
		}
		System.out.println(hmap);
		/*Iterator<Character>iterator=hmap.keySet().iterator();
		while(iterator.hasNext())
		{
			char ch=iterator.next();
			if(hmap.get(ch) >=1)
			{
				System.out.println("The character in strin is = "+ch+" Count = "+hmap.get(ch));
			}
			
		}*/
		for(Map.Entry entry:hmap.entrySet())
		{
			System.out.println("character = "+entry.getKey()+" count = "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		countcharacter("today is great day");

	}

}