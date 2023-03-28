package assignment_2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente a number for multiplication table");
		
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+i*n);
		}
		

	}

}
