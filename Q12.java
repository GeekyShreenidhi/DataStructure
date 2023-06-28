package Array;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {0,2,6,8,9};
		int n=arr1.length;
		int m = arr2.length;
		int i=0,j=0;
		while(i<n) {
			if(arr1[i]>arr2[j]) {
				swap(arr1[i], arr2[j]);
				fixarr2(arr2);
			}
			i++;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}
	private static void fixarr2(int []arr2) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=1;i<arr2.length;i++) {
			
			if(arr2[i-1]<arr2[i])swap(temp,arr2[i]);
		}
	}
	public static void swap(int m,int n) {
		int temp=m;
		m=n;
		n=temp;
	}

}
