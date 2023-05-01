package Programs;

import java.util.Arrays;

public class ClosetstToValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {5, -1, 8, -4 ,1};
		Arrays.sort(arr);
		System.out.println("the sorting value is : "+ Arrays.toString(arr));
		int closetValue= arr[0];
		System.out.println("My closet value is"+ closetValue);
		
		for(int i=0;i<arr.length;i++) {
			if(Math.abs(arr[i]) < Math.abs(closetValue)) {
				closetValue= arr[i];
				System.out.println("My closet value is : "+ closetValue);
		}else if(Math.abs(arr[i])== Math.abs(closetValue) && arr[i]> closetValue) {
			   closetValue=arr[i];
			   System.out.println("My closet value is one "+ closetValue);
		}
	  }
		
		System.out.println("The number closest to 0 in the array is: " + closetValue);
	}

}
