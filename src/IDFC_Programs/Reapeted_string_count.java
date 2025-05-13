package IDFC_Programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// string count


public class Reapeted_string_count
{
	public void finele(String str)
	{
		int l=str.length();
		Map<Character,Integer> hmap=new HashMap<Character,Integer>();
		char[] chararray=str.toCharArray();
		for(Character ch:chararray)
		{
			if(hmap.containsKey(ch))
			{
				hmap.put(ch, hmap.get(ch)+1);
			}
			else
			{
				hmap.put(ch, 1);
			}

		}
		Set<Character> keys=hmap.keySet();
		for(Character ch:keys)
		{
			if(hmap.get(ch)>l/2)
			{
				System.out.println("yes "+ch+" "+ hmap.get(ch) +" times");
			}
			else
			{
				System.out.println("No "+ch+" "+ hmap.get(ch)+" times");

			}

		}
	}

	public static void main(String[] args)
	{
		Reapeted_string_count rc=new Reapeted_string_count();
		rc.finele("illlllo");

		// TODO Auto-generated method stub

	}

}