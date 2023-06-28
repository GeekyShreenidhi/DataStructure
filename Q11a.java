package Array;

public class Q11a {

	public static void main(String[] args) {
		//find the duplicate in array
		int arr[]= new int[] {1,33,44,22,44};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) 
				System.out.println("The duplicate is"+arr[i]);
		}
     
	}

}
