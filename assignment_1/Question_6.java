package assignment_1;
import java.util.*;

public class Question_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a:");
		int a = sc.nextInt();
		System.out.println("Enter value of b:");
		int b = sc.nextInt();
		
		System.out.println("Before Swap a = "+a+" b = "+b);
		//using third variable temp
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("After Swap a = "+a+" b = "+b);
		
	}
}
