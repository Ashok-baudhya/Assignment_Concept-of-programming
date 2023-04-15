package MyShop;

public class Flower {
	
	String name;
	int no_of_petals , no_of_piece;
	float price , total_price;
	
	Flower()
	{
		name = "Flower_Company";
		no_of_petals = 15;
		no_of_piece = 4;
		price = 500;
		total_price = 3000;
	}
	
	Flower(String name,int no_of_petals,int no_of_piece,float price,float total_price)
	{
		this.name=name;
		this.no_of_petals = no_of_petals;
		this.no_of_piece = no_of_piece;
		this.price = price;
		this.total_price =total_price;
	}
	
	float calculate_discount(float total_price)
	{ 
		float discount = 0;
		if(total_price>2000)
		{
			System.out.println("\nif price Greater than 2000 discount : 200");
			return discount = total_price - 200;
		}
		else
		{
			System.out.println("\nif price Less than 2000 discount : 100");
			return discount = total_price - 100;
		}
	}
	
	void display()
	{
		Flower f = new Flower();
		
		System.out.println("============Company Details===========");
		System.out.print("\nName of Company : " + name);
		System.out.print("\nNo of Petals : " + no_of_petals);
		System.out.print("\nNo of Piece : "+ no_of_piece);
		System.out.print("\nPrice : " + price);
		System.out.print("\nTotal Price : " + total_price);
		System.out.println("\nPrice After Discount  : " + f.calculate_discount(total_price) );
	}
}
