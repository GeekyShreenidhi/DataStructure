package Array;

public class Question8 {
     //KADANE ALGO
	//LARGEST CONTIGOUS SUM
	public static void main(String[] args) {
		int a[]=new int[]{1,-2,4,-533,122,7};
        int max=0,curr=0;
		for(int i=0;i<a.length;i++) {
        	curr=curr+a[i];
       
        	if(curr>max) {
        		max=curr;
        	}
        	else if(curr<0) {
        		curr=0;
        	}
        
        }
		System.out.println(max);
	}
	

}
