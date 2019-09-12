package jaVAPROGMA;

public class RepleceString {
	public static void main(String args[]) {
		
		String str = "Eagle messaging tunnel Eagle conferencing..";
		
		String toBeReplaced = "Eagle";
		
		String toReplacedWith = "Devaraj";
		
		String[] astr = str.split(toBeReplaced);
		
		StringBuffer strb = new StringBuffer();
		
		for ( int i = 0; i <= astr.length - 1; i++ ) {
		strb = strb.append( astr[i] );
		if (i != astr.length - 1) {
		strb = strb.append(toReplacedWith);
		}
		}
		System.out.println(strb);

		}
	}
