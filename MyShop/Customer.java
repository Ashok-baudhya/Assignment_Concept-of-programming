package MyShop;

import java.util.Scanner;

public class Customer {
	
	String cname;
	String address;
	int pincode ;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name : ");
		cname = sc.next();
		System.out.print("Enter Customer Address : ");
		address = sc.next();
		System.out.println("Enter Customer Pincode");
		pincode = sc.nextInt();
	}
	
	void showData()
	{
		System.out.println("============Customer Details===========");
		System.out.print("\nCustomer Name : "+ cname);
		
		System.out.print("\nCustomer Address : " + address);
		
		System.out.println("\nCustomer Pincode : " + pincode);
		
	}
	
}
