package java_progrms;

public class withoutreve {
	
	/*public static void reverse() {
		String str = "I use selenium webdriver. selenium is a tool for web applications.";
		int i = str.length();
		StringBuffer strb = new StringBuffer();
		for( int j=i-1; j>=0; j--){
		strb = strb.append(str.charAt(j));
		}
		System.out.println(strb);
		}
}*/
 public static void main(String args[]){
	 String strb ="Zilpa";
	int i = strb.length();
	StringBuffer str = new StringBuffer();
	for(int j=i-1; j>=0; j--){
	 str = str.append(strb.charAt(j));
		
	}
	System.out.println(str);
 }
 }