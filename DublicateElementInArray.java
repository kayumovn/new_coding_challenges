package newcodingchallenges;

import java.util.HashSet;
import java.util.Set;

public class DublicateElementInArray {

	public static void main(String[] args) {
		
		String names[] = {"Java","JavaScript","Python","C","Java"};
		
		for(int i=0; i<names.length; i++) {
			
			for(int j=i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j])) {
					
					System.out.println("dublicate array is:::" + names[i]);
				}
			}
		}
		System.out.println("######################################");

	Set<String>store=new HashSet<String>();
	
	for(String name:names) {
		if(store.add(name)==false) {
			System.out.println("Dublicate element is ::::" +name);
		}
	}
	}

}
