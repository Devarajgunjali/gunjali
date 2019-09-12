package java_progrms;

import java.util.Scanner;

public class java {
	
	
	
	public static void main(String[] args) {
        System.out.println("Enter the starting range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the ending range");
        int r = sc.nextInt();
        int res = 0;
        for (int i = n; i <= r; i++) {
            if (isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4))
                res = i;
            }
        System.out.println("The biggest odd number in the range is"+"  "+res);
    }

    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        int x = (int)sqrt;
        return Math.pow(sqrt, 2) == Math.pow(x, 2);
    }
}


