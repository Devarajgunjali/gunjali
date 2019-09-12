package Oops;

public class Callbyvalue {
	int p;
	int q;

	public static void main(String[] args) {
		
		 Callbyvalue obj = new  Callbyvalue();
		 int x = 10;
		 int y = 20;
		 obj.test(x, y);
		 
		 
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		 

	}
 public int test(int a, int b){
	 a =30;
	 b = 40;
	 int c= a+b;
	 return c;
	 
 }
 
 public void swap(Callbyvalue t){
	 int temp;
	 temp = t.p;
	 t.p = t.q;
	 t.q = temp;
	
 }
}
