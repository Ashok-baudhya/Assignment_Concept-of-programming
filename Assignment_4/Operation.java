package Assignment_4;

import java.util.Scanner;

public class Operation {

	static int a,b,c;
	
	//input function
	void greater(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three number");
		System.out.println("Enter a");
		 a = sc.nextInt();
		System.out.println("Enter b");
		 b = sc.nextInt();
		System.out.println("Enter c");
		 c = sc.nextInt();
	}
	
	void greater(int a,int b){
		System.out.println("\ngreater(int a, int b) function called");
		if(a>b)
		{
			System.out.println("OUTPUT - "+a+" is greater");
		}
		else 
		{
			System.out.println("OUTPUT - "+b+" is greater");
		}
	}
	
	void greater(int a,int b,int c){
		System.out.println("\ngreater(int a,int b,int c) function called");
		if(a>b && a>c)
		{
			System.out.println("OUTPUT - "+a+" is greater");
		}
		else if(b>c)
		{
			System.out.println("OUTPUT - "+b+" is greater");
		}
		else
		{
			System.out.println("OUTPUT - "+c+" is greater");
		}	
	}
	
	public static void main(String[] args) {
		
		Operation op = new Operation();
		op.greater();
		op.greater(a,b);
		op.greater(a, b, c);
	}
}
