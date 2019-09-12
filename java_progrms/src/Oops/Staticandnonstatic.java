package Oops;

public class Staticandnonstatic {
	
	String name = "Eagleconferencing";// nonstatic method
	static int age = 52;// static method
	
	
	public static void main(String args[]){
		
		System.out.println(age);
		Staticandnonstatic obj = new Staticandnonstatic();
		System.out.println(obj.name);
	
		
		
	}
	
	public void eagle(){
		System.out.println("eagle");
		
	}
public static void sum(){
	System.out.println("sum");
	
}
}
