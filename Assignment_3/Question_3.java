package Assignment_3;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,5,6,8,90,3,457,123,567,97,10,11,34,50};
		System.out.println("Enter value to search in array");
		int v = sc.nextInt();
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==v)
			{
				System.out.println("value is present in the Array");
				break;
			}
			
			if(i==n-1)
				System.out.println("value is not present in the Array");
		}
		
	}

}
