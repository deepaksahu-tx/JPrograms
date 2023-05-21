package BasicProgram;

public class CopyofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,7};
		int arr2[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		System.out.println("Value of the new arr is ");
        for(int i=0;i<arr2.length;i++) {
        	System.out.print(" "+ arr2[i]);
        }
	}

}
