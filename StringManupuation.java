package newcodingchallenges;

public class StringManupuation {

	public static void main(String[] args) {
		
		String s = "Testing is fun to learn and selenium";
		
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.indexOf('g'));
		System.out.println(s.indexOf("fun"));
		System.out.println(s.indexOf('s', s.indexOf('s')+1));
		System.out.println(s.lastIndexOf('s'));
		
		System.out.println(s.substring(0, 10));
		
		String s1= "  hello world  ";
		System.out.println(s1.trim());
		
		System.out.println(s1.replace(" ", ""));
		
		String s2= "01-12-1990";
		System.out.println(s2.replace("-", "/"));
		
		String s3= "Hello_World_Of_Testing";
		//System.out.println(s3.split("_")); split method returns string array object
		
		String s4[]=s3.split("_");
		for(int i=0; i<s4.length; i++) {
			System.out.println(s4[i]);
		}
		
		
		
		
		
		
		
	}

}
