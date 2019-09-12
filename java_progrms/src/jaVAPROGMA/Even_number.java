package jaVAPROGMA;



public class Even_number {
	 
    public static void main(String[] args) {
           
            //define limit
            int limit = 10;
           
            System.out.println("Printing Even numbers between 1 and " + limit);
           
            for(int i=1; i <= limit; i++){
                   
                    // if the number is divisible by 2 then it is even
                    if( i % 2 == 0){
                            System.out.print(i + " ");
                    }
            }
    }
}



/*public class Eaven{

	  public static void main(String []args)
	  {
	      int n=0,i=0;
	       
	      Scanner X = new Scanner(System.in);
	       
	      System.out.print("Enter value n : ");
	      n = X.nextInt();
	       
	      for(i=1; i<n; i++)
	      {
	          if(i%2!=0)
	              System.out.println(i+" ");
	      }   
	      //System.out.println();
	       
	  }
	}
*/