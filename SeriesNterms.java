package assignment1;

public class SeriesNterms {

	static void printSeries(int n, int a, 
			int b, int c) 
	{ 
		int d; 


		if (n == 1)  
		{ 
			System.out.print(a + " "); 
			return; 
		} 
		if (n == 2)  
		{ 
			System.out.print(a + " " +  b + " "); 
			return; 
		} 

		System.out.print(a + " " +  b + " " +  c + " "); 
		for (int i = 1; i <= n; i++)  
		{ 
			d = a + b + c; 
			System.out.print(d + " "); 
			a = b; 
			b = c; 
			c = d; 
		} 
	} 


	public static void main(String[] args) 
	{ 
		int N = 7, a = 1, b = 3; 
		int c = 4; 


		printSeries(N, a, b, c); 
	} 
} 