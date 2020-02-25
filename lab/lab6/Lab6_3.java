package lab6;

public class Lab6_3 {
	
	public static void main(String[]args)
	{
		
		String s="Muskan Ahuja";
		System.out.println(getImage(s));
	
	}
	
	public static String getImage(String n) 
	{ 
		String y=n+"|";
		int j=n.length();
		for(int i=j-1;i>=0;i--)
		{
			y=y+n.charAt(i);
		}
	
		return y;
	}

}
