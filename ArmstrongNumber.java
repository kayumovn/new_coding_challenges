package newcodingchallenges;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		
		System.out.println("Given number is :::" + num);
		
		// 153, 407, 371, 370
		
		int cube = 0;
		int r;
		int t;
		
		t=num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}
		
	public static void main(String[] args) {
		isArmstrongNumber(153);

	}

}
