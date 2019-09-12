package jaVAPROGMA;

/*import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {  
	       Scanner s = new Scanner(System.in);  
	       System.out.print("Enter the first number : ");  
	       int start = s.nextInt();  
	       System.out.print("Enter the second number : ");  
	       int end = s.nextInt();  
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       for (int i = start; i <= end; i++) {  
	           if (isPrime(i)) {  
	               System.out.println(i);  
	           }  
	       }  
	   }  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	}  */


public class Prime {
	   public static void main (String[] args){		
	       int i =0;
	       int num =0;
	       String  primeNumbers = "";

	       for (i = 1; i <= 100; i++){ 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--){
	             if(i%num==0){
	            	 counter = counter + 1;
	             }
	          }
			  if (counter ==2){
			     primeNumbers = primeNumbers + i + " ";
			  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
	}