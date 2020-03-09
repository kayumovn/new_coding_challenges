package newcodingchallenges;

import java.util.HashSet;

public class DublicateWordsInGivenString {

	public static void main(String[] args) {
	
		getDublicateWord("hi this is java and java is good and java java java");

	}
	
	
	public static void getDublicateWord(String inputString) {
		String[] strArray = inputString.split("\\s");


		HashSet<String> set = new HashSet<String>();
		 
		        for (String arrayElement : strArray)
		        {
		            if(!set.add(arrayElement))
		            {
		                System.out.println("Duplicate Element is : "+arrayElement);
		            }
		        }
	}

}
