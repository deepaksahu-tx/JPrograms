package Programs;

import java.util.Scanner;

public class FirstRepetedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string value : ");
	    String value =scanner.nextLine();
        char[] arr =value.toCharArray();
        for (int i=0;i<value.length();i++) {
             for(int j=i+1;j<value.length();j++) {
        		if(arr[i]==arr[j]) {
        	   System.out.println("First Repeated character is: "+ arr[i]);
        	   return;
        	}
        }
	}
        System.out.println("not Repeated character");
  }
}
