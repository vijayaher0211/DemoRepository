package IDFC_Practice;
import java.util.HashMap;

import java.util.Map;

public class IDFC_PalindromeString {
	public static void main(String[] args) {
                            // TODO Auto-generated method stub
//		String sInput = "abcdab";
		String sInput = "bananas";
		
		if(sInput != null && sInput.length() != 0){

			char[] cArrInput = sInput.toCharArray();
		
			Map<Character, Integer> hInputStr = new HashMap<>();
		
			for(int iCount = 0; iCount < cArrInput.length; iCount++){
		
				if(hInputStr.containsKey(cArrInput[iCount])){
					hInputStr.put(cArrInput[iCount], hInputStr.get(cArrInput[iCount]) + 1);
		         }
                else{
                	hInputStr.put(cArrInput[iCount], 1);
                	}
				}
                if(hInputStr != null && hInputStr.size() != 0){
                	System.out.println(hInputStr);
                	String sPallindrome ="";

					for(int iCount = 0; iCount < hInputStr.size(); iCount++){
						int iCharOneLength = hInputStr.get(hInputStr.keySet().toArray()[iCount]);
					    String iCharOne = hInputStr.keySet().toArray()[iCount].toString();
					    if(iCharOneLength == 1) {
					    	//System.out.println(iCharOne);
					    	sPallindrome = iCharOne;
					        for(int iCount1 = 0; iCount1 < hInputStr.size(); iCount1++){
					        	int iCharTwoLength = hInputStr.get(hInputStr.keySet().toArray()[iCount1]);
					            String iCharTwo = hInputStr.keySet().toArray()[iCount1].toString();
					            for(int iCharTwoItr = 0 ; iCharTwoItr < (int) (iCharTwoLength/2) ;iCharTwoItr++ ){
					            	sPallindrome = iCharTwo + sPallindrome + iCharTwo;
					            }
					         }
					
					    }
					    if(!(sPallindrome.equalsIgnoreCase(""))){
					    	System.out.println(sPallindrome);
					    	}
					    }
					}
                	else{
						System.out.print("Wrong Input");
					}
                }
		else{
			System.out.print("Wrong Input");
			}
		}
	}