package newcodingchallenges;

public class PrintEvenAndOddNumberInArray {

	public static void main(String[] args) {
	
		int a[] = {2,3,6,4,7};
		System.out.println("Printing even number:::::::::::::");
		for(int i = 0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Printing odd number:::::::::::");
		for(int i =0; i<a.length; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		
		// Using for each loop:
		
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		for(int value:a) {
			if(value !=0) {
				System.out.println(value);
			}
		}
	}

}
