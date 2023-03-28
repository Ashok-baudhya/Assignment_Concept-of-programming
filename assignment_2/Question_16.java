package assignment_2;

import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		long a = sc.nextLong();
		System.out.println("Enter 2nd number");
		long b = sc.nextLong();
		System.out.println("Enter 3rd number");
		long c = sc.nextLong();
		
		long temp1 = a, temp2 = b, temp3 = c;
		
		long a_count=0, b_count=0, c_count=0;
		
		while(temp1!=0)
		{
			temp1/=10;
			a_count++;
		}
		
		while(temp2!=0)
		{
			temp2/=10;
			b_count++;
		}
		
		while(temp3!=0)
		{
			temp3/=10;
			c_count++;
		}
		
		if(a_count>c_count && a_count>b_count) System.out.println("largest number = "+a +" , digit = "+a_count);
		
		else if(b_count>c_count) System.out.println("largest number = "+b+" , digit = "+b_count);
			
		else System.out.println("largest number = "+c +" , digit = "+c_count);
			
	}

}
