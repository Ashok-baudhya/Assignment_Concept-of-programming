package assignment_1;
import java.util.*;

public class Question_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente Number 1");
		int a = sc.nextInt();
		System.out.println("Ente Number 2");
		int b = sc.nextInt();
		System.out.println("Ente Number 3");
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("Greater no is " + a);
		}
		else if(b>c)
		{
			System.out.println("Greater no is " + b);
		}
		else
		{
			System.out.println("Greater no is " + c);
		}

	}

}
