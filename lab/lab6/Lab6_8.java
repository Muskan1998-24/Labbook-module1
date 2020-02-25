package lab6;

public class Lab6_8 {
	public static void main(String[]args)
	{
		String a="hill";
		check(a);
	}

	public static void check(String a) {
		int flag=0;
		for (int i=a.length()-1;i>0;i--)
		{
			
			if(a.charAt(i)-a.charAt(i-1)<0)
			{
				flag=1;
			}
		}
		
		if (flag==0)
		{
			System.out.print("positive string");
		}
		else
		{
			System.out.println("Not a positive String");
		}
		
		
	}

}
