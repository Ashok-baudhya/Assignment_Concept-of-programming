package assignment_2;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int n = sc.nextInt();
		
		int count=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0) count++;
		}
		
		if(count==0)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not prime number");

	}
}
