package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		
		
	    HashMap<String,Integer> map=new HashMap<String, Integer>();
		
		TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>(map);
		
		treeMap.put("Orange", 23);
		treeMap.put("Mango", 20);
		treeMap.put("Banana", 13);
		treeMap.put("Apple", 203);
		
		for(Map.Entry<String, Integer> value:treeMap.entrySet()){
		System.out.println(value.getKey() + " :" + value.getValue());
		
	   }
		
	}

}
