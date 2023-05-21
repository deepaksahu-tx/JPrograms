package BasicProgram;

public class MaxMinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,51,7,9,34};
		int sum=0;
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];
			 sum=sum+arr[i];
			}
       System.out.println("the largest number in array : "+ max);
       System.out.println("the largest number in array : "+ sum);
       // Sum of all teh elements present in the array.
	}
	//FOR minimum value use '<'

}

