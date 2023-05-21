package Programs;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ad fg nm jk";
		String [] str1=str.split("\\s");
		String rvrs="";
		for(String name:str1) {
			StringBuilder stb=new StringBuilder(name);
			stb.reverse();
			rvrs+=stb.toString()+" ";
		}
		System.out.println("my update name is " + rvrs.trim());

	}

}
