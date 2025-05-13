package IDFC_Programs;
public class ReverseOfWords {

	public static void main(String[] args) {
		
		String reverse = "";
		String str="Today is great day";
		//String []strarray=str.split(" ");
		System.out.println("Original String = "+str);
		System.out.print("Reverse of string = ");
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.print(reverse+" ");

	}

}