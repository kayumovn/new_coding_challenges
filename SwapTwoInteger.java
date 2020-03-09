package newcodingchallenges;

public class SwapTwoInteger {

	public static void main(String[] args) {
		
		int x =5;
		int y =10;
		
		int t;
		
		//using third value
		 t=x; 
		 x=y; 
		 y=t;
		 
		 //using + operator
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 
		 //using * operator
		 x=x*y;
		 y=x/y;
		 x=x/y;
		 
		 //using ^ operator
		 x=x^y;
		 y=x^y;
		 x=x^y;
		 
		 
		
		
		
		System.out.println(x);
		System.out.println(y);

	}

}
