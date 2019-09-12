package Dynamic_Table;
public class ReplaceSpaceWithTest{

	 public static void main(String[] args) {
	  String str = "World is beautiful";
	  StringBuffer sb = new StringBuffer();
	  
	  for(int i = 0; i<str.length(); i++) {
	   if (str.charAt(i) == ' ') {
	    sb.append("Test");
	   }else {
	    sb.append(str.charAt(i));
	   }
	  }
	  System.out.println(sb);
	 }
	}	