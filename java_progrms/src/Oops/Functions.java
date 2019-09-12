package Oops;

public class Functions {
public static void main (String arg[]){
	Functions obj = new Functions();
	
	int l = obj.pqr();
	System.out.println(l);
	 String s1=obj.selenium();
	 System.out.println(s1);
int div =obj.division(30, 10);
	System.out.println(div);
}

public void print(){
	System.out.println("method names");
}
public int pqr(){
	System.out.println("pqr method");
	int a =10;
	int b= 20;
	int c=a+b;
	return c;
	
}
public String selenium(){
	System.out.println("selenium");
	String s ="Selenium";
			return s;
}

public int division(int x,int y){
	System.out.println("division method");
	int d=x/y;
	return d;
	
}

}
