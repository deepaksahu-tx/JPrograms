package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter an array List size : ");
      int arr=scanner.nextInt();
      ArrayList<Integer> list=new ArrayList<Integer>();
      System.out.println("The array list values : " );
      for(int i=0;i<arr;i++) {
    	 int element=scanner.nextInt();
    	 list.add(element);
      }
      Collections.reverse(list);
      System.out.println("The reverse list is : " );
      for(int i=0;i<list.size();i++) {
    	  System.out.println(list.get(i)+ " ");
      }
  
	}
}
