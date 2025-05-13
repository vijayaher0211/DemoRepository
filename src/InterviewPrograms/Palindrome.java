package InterviewPrograms;

public class Palindrome {


	public static void isPalindrome(int num) {
		
		
		int r = 0;
		int sum = 0;		
		int temp =num;
		
		while(num!=0) {
			r = num%10;
			num = num/10;
			sum = (sum*10) + r;
		}
		if(temp == sum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
	
	public static void StringRev(String string){
        String t;
        t=string;

        StringBuffer reversestring = new StringBuffer(String.valueOf(string)).reverse();
        System.out.println(reversestring);
	    if(t.contentEquals(reversestring)) {
	        System.out.println("It is a PALINDROME");
	    }
	    else {
	        System.out.println("It is NOT a PALINDROME");
	    }
	}
	
	
	
	
	public static void main(String[] args) {
		
		isPalindrome(-121);
		StringRev("tast");
		
	}

}
