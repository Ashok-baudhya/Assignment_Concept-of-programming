package Assignment_3;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int n = sc.nextInt();
		
		int arr_1[]= new int[n];int arr_2[]= new int[n];
		
		System.out.println("Enter value of Array_1 : ");
		for(int i=0;i<n;i++)
			arr_1[i]=sc.nextInt();
		System.out.println("Enter value of Array_2 : ");
		for(int i=0;i<n;i++)
			arr_2[i]=sc.nextInt();
		
		System.out.println();
		for(int i=0;i<n;i++)
		{
			if(arr_1[i]!=arr_2[i])
			{
				System.out.println("Not Equal");break;
			}
			if(i==n-1)
				System.out.println("Array_1 and Array_2 are Equal");
		}

	}

}
