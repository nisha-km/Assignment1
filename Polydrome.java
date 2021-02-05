package assignment1;

public class Polydrome {

	public static void main(String[] args) {
		int n=101;
		int temp=n;
		int rem,rev=0;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;

		}
		if(n==rev) {
			System.out.println("The number is polidrome");
		}else {
			System.out.println("The number is not polidrome");
		}

	}

}
