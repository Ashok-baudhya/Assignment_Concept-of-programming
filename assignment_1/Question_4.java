package assignment_1;
import java.util.*;

public class Question_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 Number");
		int number_1 = sc.nextInt();
		System.out.println("Enter 2 Number");
		int number_2 = sc.nextInt();
		
		if(number_1>number_2)
		{
			System.out.println("Greater no. is "+number_1);
		}
		else
		{
			System.out.println("Greater no. is "+number_2);
		}

	}

}
