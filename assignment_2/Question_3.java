package assignment_2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int n = sc.nextInt();
		int res=0;
		
		while(n!=0)
		{
			int rem =n%10;
			n=n/10;
			res=res*10+rem;
			
		}
		
		System.out.println("Reverse no is "+res);

	}

}
