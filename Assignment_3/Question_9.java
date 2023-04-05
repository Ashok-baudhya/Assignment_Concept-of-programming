package Assignment_3;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter number ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.print("Even number : ");
		for(int i=0;i<n;i++)
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		
		System.out.println();
		
		System.out.print("Odd number : ");
		for(int i=0;i<n;i++)
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
	}
}
