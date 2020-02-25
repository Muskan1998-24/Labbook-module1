package lab6;

public class Lab6_5 {
	public static void main(String[]args)
	{
	int a=78945;
	System.out.println(modifyNumber(a));
	
	}

	public static StringBuffer modifyNumber(int x) {
		
		StringBuffer y=new StringBuffer();
		String z=Integer.toString(x);
		for(int i=0;i<z.length();i++)
		{
			if(i==z.length()-1)
			{
				y=y.append(Math.abs(z.charAt(i)-z.charAt(0)));
			}
			else {
			y=y.append(Math.abs(z.charAt(i+1)-z.charAt(i)));
			}
		}
		
		return y;
	}

}
