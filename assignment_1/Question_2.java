package assignment_1;
import java.util.*;

public class Question_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		String result = (n>=0) ? "Positive number" : "Negative number";
		
		System.out.println(result);

	}

}
