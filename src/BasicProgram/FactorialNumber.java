package BasicProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=5;
		int i;
		int factorial=1;
		for(i=1;i<=number;i++) {
			factorial=factorial*i;
		}
	
	  System.out.println(factorial);
	  //Generating the random number
	  int max=100;
	  int min=10;
	  int value=(int) (Math.random()*(max-min));
	  System.out.println(" My random " + value);
	}

}
