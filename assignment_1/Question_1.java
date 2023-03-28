package assignment_1;
import java.util.*;

public class Question_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks - ");
		int marks = sc.nextInt();
		
		// marsk above 40 : Pass else fail
		String result = (marks>40) ? "Pass" : "Fail";
		
		System.out.println(result);
		

	}

}
