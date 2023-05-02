package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input size of the list : ");
		int n=scanner.nextInt();
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    for(int i=0;i<n;i++) {
	    		int element=scanner.nextInt();
	    		list.add(element);
	    }
	    
	    HashSet<Integer> set=new LinkedHashSet<Integer>(list);
	    list.clear();
	    list.addAll(set);
	    System.out.println(" ArrayList After removing the duplicates :");
	    for(int arr:list) {
	    	System.out.println(arr + " ");
	    }

	}

}
