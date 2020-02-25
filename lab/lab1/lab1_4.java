package lab1;



public class lab1_4 {
	public static boolean checkNumber(int n) 
	{ 
	    if(n==0) 
	    return false; 
	  
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
	       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	} 
	public static void main(String[]args)
	{
		
		int a=10;
		System.out.print(checkNumber(a));
	}

}