package assignment1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int temp=0;
		int n=scan.nextInt();
		for(int i=2; i<=n-1;i++) {
			if(n%i==0) {
				temp=temp+1;
				break;
			}
		}
		if(temp==0) {
			System.out.println("The entered number is prime");
		}
		else
		{
			System.out.println("The entered number is not prime");
		}

	}

}
