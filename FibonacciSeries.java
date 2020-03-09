package newcodingchallenges;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int x = 1;
		int y = 2;
		int sum = 0;
		
		System.out.print(x+ " "+y);
		
		for(int i = 3; i<20; i++) {
		
			sum = x+y;
			
			System.out.print(" "+sum);
			
			x=y;
			
			y=sum;
		}
			

	
	}
}
