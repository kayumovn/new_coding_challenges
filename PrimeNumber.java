package newcodingchallenges;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num %i==0) {
			return false;	
			}
		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		System.out.println("prime number up to :::" + num);
		
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + "");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("2 is prime number :::" + isPrimeNumber(2));
		System.out.println("7 is prime number :::" + isPrimeNumber(7));
		System.out.println("4 is prime number :::" + isPrimeNumber(4));
		System.out.println(isPrimeNumber(6));
		
		getPrimeNumber(20);
	}

}
