package BasicProgram;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int K=3;
		int L=5;
		//using bitwise operator
		K=K+L;
		L=K-L;
		K=K-L;
		System.out.println("updated vaule :" + K + " " + L);
		int x=3;
		int y=5;
		//using bitwise operator
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("updated vaule :" + x + " " + y);
	    // Swapping the vale by taking the third variable
		int a=4;
		int b=6,t;
		t=a;
		a=b;
		b=t;
		System.out.println("Updated value :" + a + " " + b);
		
	}

}
