package jaVAPROGMA;

//Java program to print EVEN numbers from 1 to N.

import java.util.*;

public class Eaven{

  public static void main(String []args)
  {
      int n=0,i=0;
       
      Scanner X = new Scanner(System.in);
       
      System.out.print("Enter value n : ");
      n = X.nextInt();
       
      for(i=1; i<n; i++)
      {
          if(i%2 !=0)
              System.out.println(i+" ");
      }   
      //System.out.println();
       
  }
}
