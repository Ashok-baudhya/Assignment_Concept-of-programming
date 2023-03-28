package assignment_1;
import java.util.*;

public class Question_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Product Name");
		String p_name = sc.nextLine();
		System.out.println("Product Price");
		float p_price = sc.nextFloat();
		
		float p_discount = (p_price>2000) ? ((p_price*10)/100) : (p_price*7)/100;
		
		
		System.out.println("Name of Product : "+p_name);
		System.out.println("Price of Product : "+p_price);
		System.out.println("Discount on Product : "+p_discount);

	}

}
