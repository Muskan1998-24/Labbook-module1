package lab6;
import java.util.*;
public class Lab6_1 {

	public static void main(String []args)
	{
		
		String s=new String();
		s="1 3 5 9 4";
		int sum=0;
		
		 String arr[]=s.split(" ");
		
		for (int i=0;i<arr.length;i++) {
			sum=sum+Integer.parseInt(arr[i]);
			System.out.println(arr[i]);
		}
		
		
	
	}
	
}
