package Oops;

public class Localvsglobe {
	int age = 25;
	String name = "tom";
	
	public static void main (String args[]){
		int i = 10;
		System.out.println(i);
		
		Localvsglobe obj = new Localvsglobe();
		System.out.println(obj.name);
		
		System.out.println(obj.age);
		
	}
	
	public void sum(){
		int i = 15;// locala veriable
		int j =20;
		
	}

}
