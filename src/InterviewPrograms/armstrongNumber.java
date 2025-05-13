package InterviewPrograms;

public class armstrongNumber {

	
	public static void isArmstrong(int num) {
		
		int r = 0;
		int cube = 0;		
		int temp =num;
		
		while(num !=  0) {
			r = num%10;
			num = num/10;
			cube = cube + r*r*r;
		}
		
		if(temp == cube) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		isArmstrong(-153);
		
		
	}

}
