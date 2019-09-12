package Oops;

public class Methodoverload {// method overloading same method name but different input parmeter or arguments
	

	public static void main(String[] args) {
		
		Methodoverload obj = new Methodoverload();
		obj.sum();
		obj.sum(15);
		obj.sum(20, 30);

	}
 public void sum(){
	 System.out.println("method one...");
 }
 
 public void sum(int i){
	 
	 System.out.println("method two...and one input parmeter");
	 System.out.println(i);
 }
 
 public void sum(int i, int j){
	 System.out.println("method three... two input par");
	 System.out.println(i+j);
 }
}
