package internalExam;

import java.util.Scanner;

public class spy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.");
		int n = sc.nextInt();
		int mul=1;
		int sum =0;
		
		while(n!=0)
		{
			int rem=n%10;
			sum +=rem;
			mul *=rem;
			n=n/10;
		}
		
		if(mul==sum)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
	}

}
