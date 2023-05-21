package BasicProgram;

public class FrequencOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,7,8,7,9,3,2,9};
		int count;
		System.out.println("Element | frequency");
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]){
					count++;
					arr[j]=0;
				}
			}
			if(count>0 && arr[i]!=0) {
			   System.out.println(arr[i] +"-------------- "+count);
			}
			
		}
		

	}

}
