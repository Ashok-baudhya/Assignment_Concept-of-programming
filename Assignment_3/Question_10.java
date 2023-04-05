package Assignment_3;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Array");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter value");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter Search Value");
		int ele = sc.nextInt();
		
		int s=0,l=n-1;
		
		while(s<=l)
		{
			int mid = (l+s)/2;
			
			if(arr[mid]==ele)
			{
				System.out.println("Element Present in the Array , index at "+mid);
				break;
			}
			else if(arr[mid]<ele) s=mid+1;
			else l=mid-1;
		}
		if(s>l) System.out.println("Not Found");
	}
}
