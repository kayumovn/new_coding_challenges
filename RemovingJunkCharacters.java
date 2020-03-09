package newcodingchallenges;

public class RemovingJunkCharacters {

	public static void main(String[] args) {
		
		String s = "////...<<<..java{{}}testing{}{}";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
				

	}

}
