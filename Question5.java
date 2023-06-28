package Array;

public class Question5 {

	public static void main(String[] args) {
		int array[]= new int[] {2,-1,4,-23,8,-4,33};
		for(int i=0;i<=array.length;i++) {
			if(array[i]<0) {
				array[i]=array[i];
			}
			else if(array[i]>=0) {
				int temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		System.out.print(array[i]);	
		}
		
	}

}
