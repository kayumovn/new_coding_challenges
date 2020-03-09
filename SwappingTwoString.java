package newcodingchallenges;

public class SwappingTwoString {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("the value of a is :: " + a);
		System.out.println("the value of b is :: " + b);
		
		a = a+b;
		
		System.out.println("the value of a now is :: " + a);
		
		b = a.substring(0, a.length()-b.length());
		System.out.println("the value of b now is :: " + b);
		
		a = a.substring(b.length());
		System.out.println("the value of a now is :: " + a);

	}

}
