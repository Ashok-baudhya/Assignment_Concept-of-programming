package Assignment_3;

public class Question_7 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int n = arr.length;
		
		System.out.print("Original Array : ");
		for(int i=0;i<n;i++) 
			System.out.print(arr[i]+" ");

		System.out.println();
		//reverse Array
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		
		System.out.print("Reverse Array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
