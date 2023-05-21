package BasicProgram;

public class Polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=121;
		int rvrs=0, remainder;
		int original=number;
		while(number>0) 
		{
		remainder=number%10;
		rvrs=(rvrs*10)+remainder;
		number=number/10;
		}
		if(original==rvrs) {
			System.out.println("is a polindrom");
		}else {
			System.out.println("is not an polindrom");
		}

	}

}

