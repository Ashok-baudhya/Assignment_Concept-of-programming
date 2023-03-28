package Assignment_3;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		int n = sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("Enter Arrays value");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("Average of array = "+sum/n);
		

	}

}
