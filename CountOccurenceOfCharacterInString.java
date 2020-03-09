package newcodingchallenges;

public class CountOccurenceOfCharacterInString {

	public static void main(String[] args) {
		
		String str="Java Programming Java OOPS";
		
		int len = str.length();
		
		int count=str.replace("a", "").length();
		
		int res=len-count;
		
		System.out.println("After count without a is:" + res);

	}

}
