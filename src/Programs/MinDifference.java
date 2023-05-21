package Programs;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MinDifference {
	
	
	public static int mincalulation(int arr []) {
		int max=arr[0];
		int min=arr[0];
		System.out.println(max);
		for(int i=0;i<arr.length;i++){
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		return max-min;
	}
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {12,10,3,7};
      System.out.println("min difference " + mincalulation(arr));
     /* SimpleDateFormat formatter=new  SimpleDateFormat("dd-mm-yyyy");
      Date now=new Date();*/
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();  
      System.out.println("Today is :" + dtf.format(now));
	}

}
