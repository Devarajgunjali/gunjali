package java_progrms;

public class patran {
	public static void main( String[] args ){
		int p = 0,i,k,j;
		for(  i=1; i<=5; i++ ){
		for(  k=1; k<=5-i; k++ ){
		System.out.print (" ");
		}
		for(  j=1; j<=i+p; j++ ){
		System.out.print ("*");
		}
		System.out.println ();
		p=p+1;
		}
		}
}

