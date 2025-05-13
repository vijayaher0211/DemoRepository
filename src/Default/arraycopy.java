package Default;

public class arraycopy {

	public static void main(String[] args) {  
        //declaring a source array  
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e','i', 'n' , 'a', 't', 'e', 'd', 'a', 't', 'e', 'd' };
        
//        System.out.println(copyFrom.length);
        
        //declaring a destination array  
        char[] copyTo = new char[copyFrom.length];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);
        
        //printing the destination array  
        System.out.println(String.valueOf(copyTo));  
    }
	
}
