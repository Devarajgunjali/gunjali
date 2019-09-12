package java_progrms;

public class intiger {
	public static void main (String args[]){
	int num = 12345;
	int rev =0;
	while(num!=0){
		rev=rev*10+num%10;
		num = num/10;
		
	}
	System.out.println("int rev ::"+rev);
}
}