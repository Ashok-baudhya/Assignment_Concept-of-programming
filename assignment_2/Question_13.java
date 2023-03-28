package assignment_2;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int n = sc.nextInt();
		int e_sum=0,o_sum=0;
		
		while(n!=0)
		{
			int rem = n%10;
			
			if(rem%2==0)e_sum += rem;
			if(rem%2!=0)o_sum += rem;
			
			n=n/10;
		}
		
		System.out.println("sum of even number in digit is "+ e_sum);
		System.out.println("sum of odd number in digit is "+ o_sum);

	}

}
