package NEWJAVA;

import java.util.ArrayList;

public class Arrylist {
	
	
	
	
	   public static void main(String args[]){  
	      ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Steve" at the fourth position
	      alist.add(3, "Steve");
	      alist.add(4,"Devaraj");
	      
	      alist.remove(4);
	  
	      //displaying elements
	      System.out.println(alist);
	   }  
	}

