package BasicProgram;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {2,5,81,95,34,67,89};
      int temp;
      int length=arr.length;
      System.out.println("Second Largest number ");
      for(int i=0;i<length;i++){
    	  for(int j=i+1;j<length;j++) {
    		  if(arr[i]>arr[j]) {
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    		    }
    		  }
    	  }
      System.out.println(arr[length-1]);
	}
}
