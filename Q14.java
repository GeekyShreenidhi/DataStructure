package Array;

import java.util.*;

public class Q14 {
	 public int[][] merge(int[][] intervals) {
	      Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
	      Stack<int[] > stack=new Stack();
	      stack.add(intervals[0]);
	      int[][] output=new int[stack.size()][2];
	      for(int i=1;i<intervals.length;i++) {
	    	 
	    	 int start2=intervals[i][0];
	    	 int end2=intervals[i][1];
	    	  int popArray[]=stack.pop();
	    	  int start1=popArray[0];
	    	  int end1=popArray[1];
	    	  
	    	  
	    	  int endMax=Math.max(end2, end1);
	    	  if(end1>=start2) {
	    		  int merge[]=new int [] {start1,endMax};
	    	  }
	    	  else {
	    		  stack.add(popArray);
	    		  stack.add(intervals[i]);
	    	  }
	    	  
	    	  for(int i1=output.length-1;i1>=0;i1--) {
	    		  output[i1][0]=popArray[0];
	    		  output[i1][1]=popArray[1];
	    		  
	    	  }
	    	 
	    	  
	    	  
	      }
		return output;
	      
		
	    }
	

}
