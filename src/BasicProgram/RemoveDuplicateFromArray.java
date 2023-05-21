package BasicProgram;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Integer[] array = {1, 2, 3, 3, 4, 4, 5};
	        
	        // Convert array to HashSet to remove duplicates
	        HashSet<Integer> set = new HashSet<>(Arrays.asList(array));
	        
	        // Convert back to array
	        Integer[] result = set.toArray(new Integer[set.size()]);
	        
	        // Print the array without duplicates
	        System.out.println(Arrays.toString(result));
	    }
	}


