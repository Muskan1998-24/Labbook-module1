package lab1;

public class Lab1_1 {
	
	public static void main(String[]args)
	{
		
		int a=5;
		System.out.print(calculateSum(a));
	}
	public static int calculateSum(int n) 
	{ int sum=0;
		for (int i=0;i<=n;i++)
		{
			if (i%3==0||i%5==0)
				sum=sum+i;
		}
		return sum;
	}

}
