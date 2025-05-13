package IDFC_Programs;
public class DuplStr {
 public static void main(String argu[]) {

	 String str = "I am am learning java java";
//  int count =0;
  
  
//  for(int i = 0 ;  i<=str.length(); i++) {
//	  
//	  for(int j =i+1; j<str.length(); j++) {
//		  if(str.charAt(i)==str.charAt(j)) {
//			  System.out.print(str.charAt(j));
//			  count ++;
//			  break;
//		  }
//	  }
//  }
//  
//  System.out.println();
//  System.out.println(count);
//
//  if(count >(str.length()/2)) {
//	  System.out.println("Yes");
//  }
//  else {
//	  System.out.println("No");
//  }
  
  
  
  
  
  int cnt = 0;
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	     System.out.print(inp[j]);
	     cnt++;
	     break;
	    }
	   }
	  }
	  
//	  System.out.println(cnt);
	  
  
 }
}