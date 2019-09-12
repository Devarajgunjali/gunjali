package Dynamic_Table;

import java.util.ArrayList;

public class Appended {
	
	public static void main (String args[]){
		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("Devaraj");
		alist1.add("Eagle");
		alist1.add("Tom");
		alist1.add("Berry");
		
		for(String str:alist1)
			System.out.println(str);
		
		ArrayList<String> alist2 = new ArrayList<String>();
		alist2.add("Raj");
		alist2.add("sample");
		alist2.add("king");
		alist1.addAll(alist2);
		System.out.println(alist1);
		alist1.remove(0);
		System.out.println(alist1);
		
	}

}
