package InterviewPrograms;
class FibonacciExample2{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[]){
	 
	 	int num = 3;
	        if (num < 0) {
	            System.out.println("not valid");
	        }
	        if (num == 0 || num == 1) {
	           System.out.println("not prime");
	        }
	        if (num == 2 || num == 3) {
	            System.out.println("prime number");
	        }
	        if ((num * num - 1) % 24 == 0) {
	            System.out.println("prime");
	        } 
	        else {
	            System.out.println( "not prime");
	        }
	    
	 
	 
	 
	 
//  int count=3;    
//  System.out.print(n1+" "+n2);//printing 0 and 1    
//  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}