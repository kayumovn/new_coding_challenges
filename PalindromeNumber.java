package newcodingchallenges;

public class PalindromeNumber {

	public static void isPalindrome(int num) {
		System.out.println("Given number is:::" + num);
		
		//151, 34543, 98789
		
		int r = 0;
		int sum = 0;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
			
		}
		if(t==sum) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	
	
	
	public static void main(String[] args) {
		isPalindrome(34543);

	}

}
