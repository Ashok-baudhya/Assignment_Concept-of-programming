package MyShop;

import java.util.Scanner;

public class allData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("For Flower : 1");
		System.out.println("For Customer : 2");
		System.out.println("For Exit : 0");
		System.out.println("Enter Yout Choice");
		

		int n = sc.nextInt();
		while(n!=0)
		{
		switch(n)
		{
			case 1:
			{
				Flower f = new Flower();
				f.display();
				break;
			}
			case 2:
			{
				Customer c = new Customer();
				c.getData();
				c.showData();
				
				break;
			}
			
		}
		System.out.println("\n====================================");
		System.out.println("\nEnter Your Choice Again");
		System.out.println("For Flower : 1");
		System.out.println("For Customer : 2");
		System.out.println("For Exit : 0");
		n=sc.nextInt();
		}
		System.out.println("Exit");
		
	}

}
