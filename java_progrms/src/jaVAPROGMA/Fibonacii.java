package jaVAPROGMA;


public class Fibonacii {
 
	public static void main(String[] args) 
	{
		// Set it to the number of elements you want in the Fibonacci Series
		 int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 int sum;
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 1; i <= maxNumber; i++)
	        {
	            System.out.print(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
 
	      
	            sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
 
	}
 
}



