package Assignment_4;

import java.util.Scanner;

public class Main_function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) Cube\t\t2) Square");
		System.out.println("3) Greater\t0) EXIT");
		
		func op = new func();
		System.out.println("Enter your choice");
		int n = sc.nextInt();
		
		while(n>=1 && n<=3 || n==0){
			
			if(n==0){
				System.out.println("EXIT");
				break;
			}
			if(n==1){
				System.out.println("Enter Number");
				int a = sc.nextInt();
				op.cube(a);
			}
			if(n==2){
				System.out.println("Enter Number");
				int b = sc.nextInt();
				op.square(b);
			}
			if(n==3){	System.out.println("Enter Three Number");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c= sc.nextInt();
				op.greater(a, b, c);
			}
			System.out.println("\n**********************************");
			System.out.println("\nAgain Enter your choice");
			System.out.println("1) Cube\t\t2) Square");
			System.out.println("3) Greater\t0) EXIT");
			 n = sc.nextInt();
		}
	}
}
