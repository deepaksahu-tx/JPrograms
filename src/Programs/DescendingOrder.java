package Programs;

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,9,23,98,1,567,897,5};
		int temp=0;
		System.out.println("Elements of original array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
      for(int i=0;i<arr.length;i++) {
    	  for(int j=i+1;j<arr.length;j++) {
    		  if(arr[i]<arr[j]) {
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    			  
    		  }
    	   }
       }
      System.out.println();
      System.out.println("Descending value of the array : ");
      for(int i=0;i<arr.length;i++){
    	  System.out.print(arr[i]+" ");
      }
      
      //Using Scanner Class
		
  /*    int [] number=new int[3];
      System.out.println("enter an array of element: ");
      Scanner value=new Scanner(System.in);
      for(int i=0;i<number.length;i++) {
    	  for(int j=i+1;j<number.length;j++) {
    		  number[j]=value.nextInt();
    		  if(number[i]<number[j]) {
    			  temp=number[i];
    			  number[i]=number[j];
    			  number[j]=temp;
    			  
    		  }
    	   }
       }
      System.out.println();
      System.out.println("Descending value of the array : ");
      for(int i=0;i<number.length;i++){
    	  System.out.print(number[i]+" ");
      }
      */
	}

}
