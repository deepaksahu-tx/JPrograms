package Programs;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=345;
		int revrse=0;
		while(number!=0)
		{
			int reminder=number%10;
			revrse=revrse*10+reminder;
			number=number/10;
		}
		System.out.println("My reverse number is "+ revrse);
	}

}
