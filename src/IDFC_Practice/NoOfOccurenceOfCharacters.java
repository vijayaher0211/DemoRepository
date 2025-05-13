package IDFC_Practice;

class NoOfOccurenceOfCharacters { 
    static final int MAX_CHAR = 256; 
  
    static void getOccuringChar(String str) 
    { 
        // Create an array of size 256 i.e. ASCII_SIZE 
        int count[] = new int[MAX_CHAR]; 
  
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
//        System.out.println(count[str.charAt(i)]);
        }
        
        char ch[] = new char[str.length()]; 
        
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
                  if(str.charAt(i)==str.charAt(j)) {
                	  find++;
                  }
            } 
  
            if (find ==1)  
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
            
        } 
    } 
    public static void main(String[] args) 
    { 
        String str = "test"; 
        getOccuringChar(str); 
    } 
} 