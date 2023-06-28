package Array;
import java.util.*;
public class Question7 {
	public static void reverse(int a[],int low,int high) {
		while(low<high) {
			swap(a[low],a[high]);
			low++;
			high--;
		}
	}
    private static void swap(int i, int j) {
		int temp=i;
		i=j;
		j=temp;
		
	}
	public static void rotate(int a[],int k) {
		reverse(a,0,a.length-k-1);
		
		reverse(a,a.length-k,a.length-1);
		reverse(a,0,a.length-1);
	}
	public static void print(int a[]) {
		for (int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
	 
		int a[]=new int[]{1,12,42,533,122,7,3,122,4};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the K value: ");
		int k=sc.nextInt();
		
		System.out.println("half reversed:");
		reverse(a,0,a.length-k-1);
	    print(a);
	    System.out.println();
		System.out.println("2nd half reversed:");
		reverse(a,a.length-k,a.length-1);
		print(a);
		System.out.println();
		System.out.println("The requirred rotated array:");
		reverse(a,0,a.length-1);
		print(a);
	}

}
