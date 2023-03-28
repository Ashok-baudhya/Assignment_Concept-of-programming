package Assignment_3;

public class Question_6 {

	public static void main(String[] args) {
		
		int arr[] = {1234,2,3,4,5,6,712,3243,1,76,2234,766,97,12,45,70,123,234,66};
		
		int min=0;
		int max=0;
		int n = arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			// for max value
			if(arr[i+1]>arr[max])
			{
				max=i;
			}
			//for minimum value
			if(arr[i+1]<arr[min])
			{
				min=i;
			}
		}
		
		System.out.println("minimum value = "+arr[min]+" at index = "+min);
		System.out.println("maximum value = "+arr[max]+" at index = "+max);
		

	}

}
