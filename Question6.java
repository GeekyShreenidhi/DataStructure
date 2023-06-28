package Array;
import java.util.*;

public class Question6 {
    public static void aUnion(int a[],int b[],int m,int n) {
		int i=0,j=0;
    	while(i<m && j<n) {
			if(a[i]<b[j]) {
				System.out.print(a[i++]+" ");
			}
			else if(a[i]>b[j]) {
				System.out.print(b[j++]+" ");
			}
			else {
				System.out.print(b[j++]+" ");
				i++;
			}
		}
    	while(i<m) {
    		System.out.print(a[i++]+" ");
    	}
    	while(j<n) {
    		System.out.print(b[j++]+" ");
    	}
	}
    public static void aIntersection(int a[],int b[],int m,int n) {
    	int i=0,j=0;
    	while(i<m && j<n) {
			if(a[i]<b[j]) {
				i++;
			}
			else if(a[i]>b[j]) {
				j++;
			}
			else {
				System.out.print(b[j++]+" ");
				i++;
			}
		}
    	while(i<m) {
    		i++;
    	}
    	while(j<n) {
    		j++;
    	}
    }
    
	public static void main(String[] args) {
	    int a[]=new int[]{1,12,42,533,122,7};
	    int b[]=new int[]{12,4,1,42,45,23,7};
	    Arrays.sort(a);
	    Arrays.sort(b);
	    int m=a.length;
	    int n=b.length;
	   
	    System.out.println("The Intersection :-");
	    aIntersection( a, b, m, n);
	    System.out.println();
	    System.out.println("The UNION :-");
	    aUnion(a, b, m, n);         
	}

}
