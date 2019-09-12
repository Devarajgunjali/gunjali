package java_progrms;

public class testi {
	
	   /* public static void main(String[] args) {
	        try {
	            int n1 = 100;
	            int n2 = 250;
	            int res = 0;

	            if (n1 % 2 == 0) {
	                n1 += 1;

	                for (int i = n1; i < n2; i += 2) {
	                    if (isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4))
	                        res = i;
	                    System.out.println(res);
	                }
	            }
	        } catch(Exception ignored) {
	            //System.out.println("0");
	        }
	    }

	    public static boolean isPerfectSquare(int num) {
	        double sqrt = Math.sqrt(num);
	        int x = (int)sqrt;
	        return Math.pow(sqrt, 2) == Math.pow(x, 2);
	    }
	}*/



public static void main(String[] args) {
	int n1 = 100;
	int n2 = 250;
	int n3 = 6765;
	int n4 = 6865;
	int res = 0;
	int res1 = 0;
	
   
   
    for (int i = n1; i <= n2; i++) {
            if (isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4))
                res = i;
            }
        System.out.println(+res);
        for (int j = n3; j <= n4; j++) {
            if (isPerfectSquare(5 * j * j + 4) || isPerfectSquare(5 * j * j - 4))
                res1 = j;
            }
        System.out.println(+res1);
    }






    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        int x = (int)sqrt;
        return Math.pow(sqrt, 2) == Math.pow(x, 2);
    }
}