package assignment_2;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for Fibonacci Series");
		
		int a = 0,b=1,c;
		
		int n = sc.nextInt();
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
