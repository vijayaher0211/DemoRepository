package IDFC_Programs;
public class Combination_of_string_mereger
{
	public static void solve(String a,String b,int k)
	{
		String s="";
		
		int la=a.length();
		int lb=b.length();
		int l=la+lb;
		int indexofa=0, indexofb=0;
		while(l>0)
		{
			int pa=0,pb=0;
			
			if(la-indexofa>=k)
			{
				s=s+a.substring(indexofa, indexofa+k);
				System.out.println(indexofa);
				System.out.println(indexofa+k);
				System.out.println("index at first "+s);
				indexofa=indexofa+k;
				pa=k;
			}
			else if(la-indexofa<k && la-indexofa>0)
			{
				s=s+a.substring(indexofa, la);
				System.out.println("index at first "+s);

				pa=la-indexofa;
				indexofa=la;

			}
			else if(indexofa>=la)
				pa=0;

			if(lb-indexofb >=k)
			{
				s=s+b.substring(indexofb, indexofb+k);
				System.out.println("index at second "+s);
				pb=k;
				indexofb=indexofb+k;
			}
			else if(lb-indexofb<k && lb-indexofb>0)
			{
				s=s+b.substring(indexofb, lb);
				System.out.println("index at second "+s);
				pb=lb-indexofb;
				indexofb=lb;
			}
			else if(indexofb>=lb)
				pb=0;
			l=l-pa-pb;

		}
		System.out.println(s);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String a="abc";
		String b="def";
		int k=2;
		solve(a,b,k);

	}

}