package BasicProgram;

import java.util.Arrays;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {34,14,3,4,5,61,7,18};
		System.out.println(" reverse number");
		/*for(int i=arr.length-1;i>=0;i--) {
			System.out.print(" "+ arr[i]);
		}*/
		
		//Finding smallest and largest number from array.
		Arrays.sort(arr);
		int length=arr.length;
		System.out.println("Sorted array");
	    for(int i=0;i<length;i++) {
	    	System.out.print(" "+arr[i]);
	    }
		System.out.println("smallest number is " + arr[0]);
    	System.out.println("greatest number is " + arr[length-1] );

	}

}
