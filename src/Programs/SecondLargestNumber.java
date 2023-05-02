package Programs;

import java.util.HashSet;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int n=scanner.nextInt();
		System.out.println("Enter the numbers in the Array : ");
		int arr[]=new int[n];
		HashSet<Integer> set=new HashSet<Integer>();
		HashSet<Integer> duplicateSet=new HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
		  if(!set.add(arr[i])){
			  duplicateSet.add(arr[i]);
		  }
		}
		System.out.println("Duplicate elements are: " + duplicateSet);
	}

}
