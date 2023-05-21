package Programs;

import java.util.Arrays;

public class SecondLargestNum {
	public static void main(String [] args) {
		int[] arr= {45,23,78,1001,10};
		Arrays.sort(arr);
		int size=arr.length;
		System.out.println(arr[size-2]);
		
	}

}
