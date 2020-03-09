package newcodingchallenges;

import java.util.Arrays;
import java.util.Collections;

public class MethodsToSortingArray {

	public static void main(String[] args) {
		
		int a[]= {20,10,50,40};
		
		System.out.println("Before sorting : " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("After sorting : " + Arrays.toString(a));
		
		int b[]= {30,20,35,50};
		
		System.out.println("Before sorting: " + Arrays.toString(b));
		
		Arrays.sort(b);
		
		System.out.println("After sorting: " + Arrays.toString(b));
		
		Integer c[]= {20,10,70,40};
		
		System.out.println("Before sorting: " + Arrays.toString(c));
		
		Arrays.sort(c,Collections.reverseOrder());
		
		System.out.println("After sorting: " + Arrays.toString(c));

	}

}
