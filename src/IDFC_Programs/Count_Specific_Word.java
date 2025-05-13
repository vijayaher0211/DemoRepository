package IDFC_Programs;
import java.util.Scanner;

public class Count_Specific_Word {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter String");
		String name="I am am learning java java java java";
		String namearray[]=name.trim().split(" ");
		System.out.println("Enter character");
		String searchString=sc.next();
		
		for(int i=0;i<=namearray.length-1;i++)
		{
			if(namearray[i].equalsIgnoreCase(searchString))
			{
				count++;
			}
		}
		System.out.println(searchString+ " character appear "+count+" times in string");

	}

}