package Assignment_3;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int P_count =0,N_count=0,O_count=0,E_count=0,Z_count=0;
		System.out.println("Enter 20 Element");
		for(int i=0;i<arr.length;i++)
			arr[i]= sc.nextInt();
		
		for(int a : arr)
		{
			if(a>=0) P_count++;
			if(a<0) N_count++;
			if(a%2!=0) O_count++;
			if(a%2==0) E_count++;
			if(a==0) Z_count++;
		}
		
		System.out.println("Total Positive number : "+P_count);
	
		System.out.println("Total Negative number : "+N_count++);
	
		System.out.println("Total Odd Number : "+O_count++);
		
		System.out.println("Total Even Number : "+E_count++);
		
		System.out.print("Total 0 : "+Z_count++);

	}

}
