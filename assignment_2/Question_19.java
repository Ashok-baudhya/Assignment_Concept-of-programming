package assignment_2;

import java.util.Scanner;

public class Question_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("For Addition Type add");
		System.out.println("For Subtraction Type sub");
		System.out.println("For Multiple Type mul");
		System.out.println("For Exit Type exit");
		System.out.println();
		
		System.out.print("Enter Operation : ");
		System.out.println();
		String str = sc.next();
		
		switch(str)
		{
		case "add" :
				{
					System.out.print("Enter 1st number = ");
					int a = sc.nextInt();
					System.out.print("Enter 2nd number = ");
					int b = sc.nextInt();
					int sum = a+b;
					System.out.println("Sum = "+ sum);
				}
				break;
		case "sub" :
				{
					
					System.out.print("Enter 1st number = ");
					int a = sc.nextInt();
					System.out.print("Enter 2nd number = ");
					int b = sc.nextInt();
					int sub = a-b;
					System.out.println("Subtraction = "+ sub);
				}
				break;
		case "mul" :
				{
					System.out.print("Enter 1st number = ");
					int a = sc.nextInt();
					System.out.print("Enter 2nd number = ");
					int b = sc.nextInt();
					int mul = a*b;
					System.out.println("Multiple = "+ mul);
				}
				break;
		case "exit": break;
				
		}

	}

}
