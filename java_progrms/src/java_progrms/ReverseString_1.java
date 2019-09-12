package java_progrms;

import java.util.Scanner;
/*public class ReverseString_1 {
	 public static void main(String args[])
	   {
	      String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);
	   }
	}

*/
		
/* //*[contains(@attribute_name,'attribute_value')]

/*The ZILPA  is an Web based app on art collection and is beneficial for all
artists, art collectors, art galleries and museums. The user can access the collection from
anywhere in the world, as well update the collection with new artworks or same artworks with
added information. In the confidential section, users can save all the confidential artwork related
data.*/
	 
	 
	public class ReverseString_1{
		public static void main(String args[]){
			String reverse="";
			String s="";
			Scanner in = new Scanner(System.in);
			System.out.println("enter string ");
			s=in.nextLine();
			int length = s.length();
		  for(int i = length-1; i >=0; i--)
				reverse = reverse+s.charAt(i);
			System.out.println("Entered reverse String is:" +reverse);
		}
	}
	//