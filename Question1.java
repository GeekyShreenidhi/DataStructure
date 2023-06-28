package Array;
import java.util.*;

//REVERSE THE ARRAY
public class Question1 {
    public static void Reverse() {
    	Scanner a = new Scanner(System.in);
    	
    	System.out.println("Enter the number of elements in array: ");
    	int size=a.nextInt();
    	
    	int arr[]=new int[size];
    	for(int i=0;i<size;i++) {
    		System.out.println("Enter the element "+i);
    		arr[i]=a.nextInt();
    		
    	}
    	
    	for(int i=0;i<size;i++) {
    		System.out.print(arr[i]+"-->");
    		
    	}
    	System.out.println("This is original....");
    	for (int j=size-1; j>=0;j--) {
			System.out.print(arr[j]+"<--");
			
		}
    	System.out.println("The reversed array...");
    	
    	
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Question1.Reverse();
	}

}
