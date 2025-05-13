package IDFC_Programs;
public class countAllWords {

	public static void main(String[] args) {
		String name="I am a girl";
		char[] ch = name.toCharArray();
		String count[]=name.split(" ");
		System.out.println("Thr string is = "+name);
		System.out.println("The number of words in string = "+count.length);
		System.out.println(ch.length);

	}

}