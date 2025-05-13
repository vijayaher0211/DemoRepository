package InterviewPrograms;

public class primeNumber {

	
	public static boolean isPrimeNumber(int num) {
		
		
		if(num<2) {
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	
	public static void getPrimeNumbers(int num) {
		
		for(int i = 2; i <=num ; i++) {
			
			if(isPrimeNumber(i)) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		System.out.println("are Prime Numbers upto " + num );

	}
	
	
	public static void main(String[] args) {
		
//		System.out.println(isPrimeNumber(10));
//		System.out.println(isPrimeNumber(5));
//		System.out.println(isPrimeNumber(4));
//		System.out.println(isPrimeNumber(3));
//		System.out.println(isPrimeNumber(17));
//		System.out.println(isPrimeNumber(2));

		getPrimeNumbers(25);
		
//		boolean result = isPrimeNumber(10);
//		System.out.println(result);
	}

}
