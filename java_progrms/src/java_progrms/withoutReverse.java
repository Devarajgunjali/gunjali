package java_progrms;

public class withoutReverse {
	
	public static void main(String args[]) {
		
		String str = "I use selenium webdriver. selenium is a tool for web applications.";
		
		/*int i = str.length();
		
		StringBuffer strb = new StringBuffer();
		
		for( int j=i-1; j>=0; j--){
			
		strb = strb.append(str.charAt(j));
		}
		System.out.println(strb);
		}

}
*/
		int i = str.length();
		StringBuffer strb = new StringBuffer();
		for(int j=i-1; j>=0; j--){
			strb = strb.append(str.charAt(j));
		}
		System.out.println(strb);
	}
	}

	