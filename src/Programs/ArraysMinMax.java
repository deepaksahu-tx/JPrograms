package Programs;

public class ArraysMinMax {
	
	
   public static int getmin(int arr[],int size ) {
		int minimum=arr[0];
		for(int i=0;i<size;i++) {
			minimum=Math.min(minimum, arr[i]);
		}
		return minimum;
	}
	
     public static int getmax(int arr[],int size) {
    	 int maximum=arr[0];
    	 for(int i=0;i<size;i++) {
    		 maximum=Math.max(maximum, arr[i]);
 		}
		return maximum;
	}
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] arr= {23,56,78,98,2};
		int size=arr.length;
		System.out.println("minimum ans maximum values are :");
	   System.out.println(getmin(arr, size) + " " + getmax(arr,size));
	  
	}
	
	

}
