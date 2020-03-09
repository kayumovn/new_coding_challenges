package newcodingchallenges;

public class ReverseWordInString {

	public static void main(String[] args) {
		
		
		String str="Welcome to Java";
		
		String [] words=str.split(" ");
		
		String reverseString="";
		
		for(String w:words) {
			
			String reverseword="";
			
			for(int i=w.length()-1; i>=0; i--) {
				
				reverseword = reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword + " ";
		}
		System.out.println(reverseString);
		
		
		// Second approach:
		
		String s= "Java is fun to learn";
		
		String [] s1 = s.split("\\s");
		
		String revs="";
		
		for(String w: s1) {
			
			StringBuilder sb=new StringBuilder(w);
			
			sb.reverse();
			
			revs=revs+sb.toString()+ " ";
		}
		System.out.println(revs);

	}

}
