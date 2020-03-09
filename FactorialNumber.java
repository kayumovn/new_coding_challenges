package newcodingchallenges;

public class FactorialNumber {

	//4===4*3*2*1==24
	//3==3*2*1==6
	
	public static int factorial(int num) {
		
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static int fact(int num) {
		
		if(num==0)
			return 1;
		else
			return (num*fact(num-1));
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(fact(3));

	}

}
