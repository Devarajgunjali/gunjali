package NEWJAVA;

public class Primenumber {
	
	
	public static boolean primenumber(int num){
		
		if(num<=1){
			return false;
		}
		for(int i=2;i<num; i++){
			if(num % i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumber(int num){
		for(int i=2;i<=num;i++){
			if(primenumber(i))
				System.out.println(i +"");
			}
		}
		
	

public static void main(String args[]){
	
	System.out.println("prime :::" +primenumber(0));
	
	getPrimeNumber(20);
}
}
