package BasicProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="deepaksahoo";
       LinkedHashSet<Character> set= new LinkedHashSet<>();
        
       for(int i=0;i<str.length();i++) 
    	  set.add(str.charAt(i));
    	  System.out.println("new String  value is:  ");
    	  for(Character ch:set)
    		  System.out.print(ch);
       
	}

}
