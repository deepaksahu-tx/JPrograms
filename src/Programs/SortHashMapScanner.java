package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortHashMapScanner {
	
    public static void main(String args[])
    {
    	
    	Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter the number of key-value pairs in the HashMap:");
    	 int n=scanner.nextInt();
    	 scanner.nextInt();
    	 
    	 HashMap<String, Integer> map = new HashMap<String,Integer>();
    	 
    	  for (int i = 0; i < n; i++) {
              System.out.println("Enter key for pair " + (i+1) + ":");
              String key = scanner.nextLine();
              System.out.println("Enter value for pair " + (i+1) + ":");
              int value = scanner.nextInt();
              scanner.nextLine();
              map.put(key, value);
              
              Map<String, Integer> sortedMap = new TreeMap<String,Integer>();
              System.out.println("the sorted value is " + sortedMap );
              
          }

    	
    	

    
        
    }
}

