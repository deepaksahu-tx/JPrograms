package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of element you need in the array : ");
		int n=scanner.nextInt();
		int arr []= new int[n];
		System.out.println("Enter the element in the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int oddArray[]=new int[n];
		int evenArray[]=new int[n];
		int evenCount=0,oddCount=0;
		 
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0){
				evenArray[evenCount]=arr[i];
				evenCount++;
		}else {
			oddArray[oddCount]=arr[i];
			oddCount++;
		}
	  }
		System.out.println("The even numbers are : ");
		for(int i=0;i<evenCount;i++){
			System.out.println(evenArray[i]+ " ");
			
		}
		System.out.println("The odd numbers are : ");
		for(int i=0;i<oddCount;i++){
			System.out.println(oddArray[i] + " ");
			
		}

	}

}
