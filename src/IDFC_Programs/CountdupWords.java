package IDFC_Programs;
public class CountdupWords {

	public static void main(String[] args) {
		String str="I live in in Thane";
		String arrOfStr[]=str.split(" ");
		int num=arrOfStr.length;
		System.out.println("Given String is = "+str);
		System.out.println("Duplicate words are = ");
		for(int i=0;i<num-1;i++)
		{
			for(int j=0;j<num-i-1;j++)
			{
				if(arrOfStr[j].equalsIgnoreCase(arrOfStr[j+1])) // if(arrOfStr[j] == arrOfStr[j+1])
				{
					System.out.println(arrOfStr[j]);
				}
			}
		}
		

	}

}