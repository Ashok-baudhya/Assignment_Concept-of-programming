package Assignment_3;
import java.util.*;

public class Question_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int sum=0;
		
		System.out.println("Enter Array value");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("Sum of Arrays value = "+sum);
		
	}

}
