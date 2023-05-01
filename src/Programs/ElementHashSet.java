package Programs;

import java.util.HashSet;

public class ElementHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<>();
		set.add("welcome to geeks");
		set.add("welcome");
		
		System.out.println("HashSet: " + set);
		System.out.println("Does the Set contains welcome : " + set.contains("welcome"));
		
	}

}
