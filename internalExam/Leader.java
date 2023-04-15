package internalExam;
import java.util.Scanner;

public class Leader {
	
	static void leaderArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int j;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<=arr[j]) break;
			}
			
			if(j==arr.length) System.out.print(arr[i] +" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter Value in Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("\nLeader In Array : ");
		leaderArray(arr);
		
	}
}
