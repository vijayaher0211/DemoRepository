package InterviewPrograms;
import java.util.*;   
class PalindromeExample2  
{  
   public static void main(String args[])  
   {  
      String original = "191", reverse = ""; // Objects of String class  
//      Scanner in = new Scanner(System.in);
      
      
      
      int length = original.length();
      
      for ( int i = length -1 ; i >= 0; i-- ) {
         reverse = reverse + original.charAt(i);         
      }
      if (original.equalsIgnoreCase(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  