
package BasicProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=27;
	    boolean isPrime=true;
	    
	    for(int i=2;i<number;i++){
	    	if(number%i==0){
	    		isPrime=false;
	    		break;
	    	}
	    	
	    }
	    if(isPrime) {
	    	System.out.println("Is a prime number");
	    }else {
	    	System.out.println("is not a prime number");
	    }
	

	}

}
