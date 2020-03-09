package newcodingchallenges;

public class SearchingelementInArray {

	public static void main(String[] args) {
		
		int a[]= {20,30,10};
		
		int search_el=40;
		boolean flag=false;
		for(int i = 0; i<a.length; i++) {
			if(search_el==a[i]) {
				System.out.println("Element found: " + i);
				flag=true;
				break;
			}
		}

	if(flag==false) {
		System.out.println("Element not found");
	}
	}

}
