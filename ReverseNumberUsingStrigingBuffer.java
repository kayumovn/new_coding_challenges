package newcodingchallenges;

public class ReverseNumberUsingStrigingBuffer {

	public static void main(String[] args) {
		
		int num = 12345;
		
		
		StringBuffer sb = new StringBuffer();
		sb.append(num);
		System.out.println(sb.reverse());
		
		
		//Using StrinBuffer class
		
		int a= 234;
		
		StringBuilder sbl = new StringBuilder(String.valueOf(a));
		
		//sbl.append(a);
		//StringBuilder rev = sbl.reverse();
		
		//System.out.println("Reversed number is :" + rev);
		System.out.println(sbl.reverse());

	}

}
