package lab5;
import java.util.*;
public class Lab5_3 {
	private static Scanner in;

	public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       in = new Scanner(System.in);
	       System.out.print("Enter the  prime numbers");
	       int a=in.nextInt();
	       String  primeNumbers = "";

	       for (i = 1; i <= a; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to "+a+" are :");
	       System.out.println(primeNumbers);
	   }

}
