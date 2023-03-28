package assignment_1;
import java.util.*;

public class Question_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of X");
		int number_1 = sc.nextInt();
		System.out.println("Enter the value of Y");
		int number_2 = sc.nextInt();
		
		System.out.println("Before Swap X = "+number_1+" Y = "+number_2);
		
		number_1 = number_1 + number_2;
		number_2 = number_1 - number_2;
		number_1 = number_1 - number_2;
		
		System.out.println("After Swap X = "+number_1+" Y = "+number_2);
				
				
	}

}
