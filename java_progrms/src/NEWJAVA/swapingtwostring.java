package NEWJAVA;

import javax.sound.midi.SysexMessage;

public class swapingtwostring {
	
	
	public static void main(String args[]){
		
		String a = "Devaraj";
		String b="Gunjali";
		
		System.out.println("Beforswaping a is::" +a);
		System.out.println("Beforswaping b is::" +b);
		
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("after swaping a is::" +a);
		System.out.println("afterswaping b is::"  +b);
		
		
		
	}

}
