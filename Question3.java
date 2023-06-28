package Array;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		int array[]=new int[] {4,76,65,22,78};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
    		System.out.print(array[i]+"-->");
		}
		Scanner s= new Scanner(System.in);
		System.out.println("Which largest?");
		int largest=s.nextInt();
			if(largest<array.length) {
				System.out.println(array[largest-1]);
			}
			int smallest=s.nextInt();
			
			 if(smallest<array.length) {
				System.out.println(array[smallest-1]);
			}
			
		
		
    	

	}

}
