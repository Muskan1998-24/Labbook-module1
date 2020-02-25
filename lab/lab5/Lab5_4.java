package lab5;
import java.util.*;
public class Lab5_4 {
	
	public static void main(String []args) throws ValueNullException
	{
		Scanner in=new Scanner (System.in);
		String firstname,lastname;
		System.out.print("enter  firstname");
		firstname=in.nextLine();
		
		System.out.print("enter  lastname");
		lastname=in.nextLine();
		
		if (lastname.isEmpty()||firstname.isEmpty())
		{
			ValueNullException exception =new ValueNullException("first or last name is empty");
			throw exception;
		}
		
		System.out.println(firstname);
		System.out.println(lastname);
		
		
		
	}

}
