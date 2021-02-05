package assignment1;

import java.util.Scanner;

public class DivisibleByfive {

	public static void main(String[] args) {
		{

			Scanner in =new Scanner (System.in);
			int p=2,i,s=165,n;
			System.out.println ("Enter the value of n");
			n=in.nextInt ();
			for (i=1;i <=n;i++)
			{
				if(p%2==0)
				{
					s=s+30;
				}
				else
				{
					s=s+60;
				}
				System.out.println (s+",");
				p++;
			}
		}
	}


}


