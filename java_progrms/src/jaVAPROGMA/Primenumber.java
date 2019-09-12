package jaVAPROGMA;

import java.util.Scanner;

public class Primenumber {
	
	public static void main (String []args){
		
		int i = 0;
		int num = 0;
		String Primenumber = " ";
		System.out.println("Enter value of n:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		for(i=1; i<=n; i++){
			int counter = 0;
			for(num=i; num>=1; num--){
				if(i%num == 0){
					counter = counter +1;
				}
			}
			if(counter==2){
				Primenumber= Primenumber+ i + " ";
			}
			}
		System.out.println("primenumbers are 1 to n");
		System.out.println(Primenumber);
		}
}


/*System.out.println("Enter the value of n :");
int n = scanner.nextInt();
scanner.close();*/