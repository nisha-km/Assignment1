package assignment1;

import java.util.Scanner;

public class PatternNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter how many rows you want");
		int rows=scan.nextInt();
		for(int i=rows-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}


	}

}
