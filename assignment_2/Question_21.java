package assignment_2;

import java.util.Scanner;

public class Question_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n1 number");
		double n1 = sc.nextDouble();
		System.out.println("enter n2 number");
		double n2 = sc.nextDouble();
		
		if(n1 > 0 && n2 < 1 &&  n2 > 0 && n1 < 1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
