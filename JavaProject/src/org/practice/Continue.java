package org.practice;

public class Continue
{
	public static void main(String[] args)
	{
		int n=1;
		while(n<=5)
		{
			System.out.println(n);
			n++;
			System.out.println("while block 1st stmt");
			if(n==3) 
			{
				System.out.println(n);
				System.out.println("if block");
				n++;
				continue;
			}
			System.out.println("while block 2nd stmt");
		}
	}

}

	


