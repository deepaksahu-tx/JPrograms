package Programs;

import java.util.ArrayList;

public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> arrOne=new ArrayList<String>();
     arrOne.add("5 welcome to geeks 4 geeks ");
     
     ArrayList<String> arrTwo=new ArrayList<String>();
     arrTwo.add("5 welcome to geeks 4 geeks ");
     
    /* boolean value =arrOne.equals(arrTwo);
     System.out.println(value);*/
     
     if(arrOne.equals(arrTwo)){
    	 System.out.println("both array are equal");
     }else {
    	 System.out.println("both array are not equal");
     }
    
	}

}
