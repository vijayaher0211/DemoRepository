package IDFC_Programs;


// palindromic

public class CFG
{
	static String findlngstring(String str)
	{
		int count[]= new int[300];//to store freq of character in string
		for(int i=0;i<str.length();i++)//freq of character in input string
		{
			System.out.println("for " +i+ " count "+str.charAt(i));
			count[str.charAt(i)]++;
			System.out.println(count[str.charAt(i)]);
		}

		String beg="",
				mid="",
				end="";//any palindrome consist of 3 parts
		
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println("for count of " +ch+ " is "+count[ch]);
			if(count[ch]%2==1)
			{
				mid=String.valueOf(ch);
				System.out.println("valu  of mid is "+mid);
				//System.out.println(" before decrement  count of " +ch+ " is "+count[ch--]);

				count[ch--]--;
				//System.out.println(" after decrement  count of " +ch+ " is "+count[ch--]--);
			}
			else
			{

				for(int i=0;i<count[ch]/2;i++)
				{
					beg +=ch;

				}
			}
		}
		System.out.println(beg);
		end=beg;

		end=reverse(end);
		System.out.println(end);
		return beg+mid+end;



	}
	static String reverse(String str)
	{
		String ans="";
		System.out.println(str+" //");
		char[] try1 =str.toCharArray();
		for(int i=try1.length-1;i>=0;i--)
		{
			ans+=try1[i];
		}
		System.out.println("valie of ans is "+ans);
		return ans;

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="awesome";
		System.out.println(findlngstring(str));

	}

}