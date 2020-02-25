package lab6;

public class Lab6_4 {
	
	public static void main(String[]args)
	{
		
		String s="JAVA";
		System.out.print(alterString(s));
	}
	public static String alterString(String n) 
	{ 
		String s="";
		for (int i=0;i<n.length();i++)
		{
			 if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u' || 
					 n.charAt(i)=='A' || n.charAt(i)=='E' || n.charAt(i)=='I' || n.charAt(i)=='O' || n.charAt(i)=='U')
			 {
				 s=s+n.charAt(i);
			 }
			 else
			 {
				 s=s+(char)(n.charAt(i)+1);
			 }
		}
		return s;
		
	}

}
