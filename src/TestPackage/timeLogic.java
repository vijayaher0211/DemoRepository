package TestPackage;

import java.util.Calendar;

public class timeLogic {
	
	static boolean flag;

	public static void main(String[] args) {
		runScriptCondition();	
	}
	
	public static void runScriptCondition(){
		
		Calendar time = Calendar.getInstance();
		int hour = time.get(Calendar.HOUR_OF_DAY);
		int min = time.get(Calendar.MINUTE);
		System.out.println(hour);
		System.out.println(min);
		
		if((min>=0 && min<=15) && (hour == 9 || hour == 12 || hour == 15 || hour == 18 || hour == 21)){
			System.out.println("Yessssssssssssss");
			flag = true;
			System.out.println(flag);
		}else{
			System.out.println("Nooooooooooooo");
			flag = false;
			System.out.println(flag);
		}
	}
}
 