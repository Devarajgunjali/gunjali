package Dynamic_Table;

import java.util.ArrayList;
import java.util.Collections;

public class Swaping {
	
	
	public static void main(String a[]){
	    ArrayList<String> al = new ArrayList<String>();
	    System.out.println("arraylis is empty : " +al.isEmpty());
	    al.add("Sachin");
	    al.add("Rahul");
	    al.add("Saurav");
	    al.add("Sunil");
	    al.add("Kapil");
	    al.add("Vinod");
	    
	    al.set(0, "Devaraj");
	    System.out.println(al);
	    System.out.println("arraylis is empty : " +al.isEmpty());
	    Collections.swap(al, 0, 5);
	    for(String str:al){
	    
	    System.out.println(str);
	    
}
}}	