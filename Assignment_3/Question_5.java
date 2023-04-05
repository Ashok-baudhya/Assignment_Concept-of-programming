package Assignment_3;

public class Question_5 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int n = arr.length;
		int arr_copy[] = new int[n];
		
		System.out.print("Original Array = ");
		for(int i=0;i<n;i++)
		{
			arr_copy[i]=arr[i];
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Copy Array = ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr_copy[i]+" ");
		}

	}

}
