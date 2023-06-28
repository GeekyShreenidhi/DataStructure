package Array;

public class Question2 {

	public static void main(String[] args) {
		int array[]=new int[] {2,43,23,423,433,22};
		int maxElement=array[0];
		int minElement=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>maxElement) {
				maxElement=array[i];
			}
		}
		System.out.println("The max element is "+maxElement);
		for(int j=0;j<array.length;j++) {
			if(array[j]<minElement) {
				minElement=array[j];
			}
		}
		System.out.println("The min element is "+minElement);
	}

}
