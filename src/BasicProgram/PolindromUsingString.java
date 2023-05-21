package BasicProgram;

public class PolindromUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=232;
		String value=String.valueOf(number);
		String rvrse="";
		
		for(int i=value.length()-1;i>=0;i--) {
			rvrse+=value.charAt(i);
		}
		if(rvrse.equals(value)) {
			System.out.println("Is a polindrom");
		}else {
			System.out.println("is not a polindrom");
		}
		

	}

}
