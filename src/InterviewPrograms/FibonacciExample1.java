package InterviewPrograms;
class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=1;
// System.out.print(n1+" "+n2);//printing 0 and 1    
    
 if(count > 2) {
//	 System.out.println("inside if for loop");
	 System.out.println(n1);//printing 0 and 1    
	 System.out.println(n2);//printing 0 and 1    

 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {
//	 System.out.println("inside for");
  n3=n1+n2;    
  System.out.println(n3);    
  n1=n2;    
  n2=n3;    
 }
}
 
 if(count == 1) {
//	n3 = 0;
	System.out.println(n1);
 }
 if (count == 2) {

	 System.out.println(n1);
	 System.out.println(n2);
	 
}
 
  
}
}  