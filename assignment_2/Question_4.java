package assignment_2;
import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
		    int sum = 0;
		    char ch;
		    do{
		      System.out.println("Enter two numbers");
		      int num1= sc.nextInt();
		      int num2 = sc.nextInt();
		      sum = num1+num2;
		      System.out.println("sum = "+sum);
		      System.out.println("Do you want to Repeat the addition , Y/N");
		      ch = sc.next().charAt(0) ;
		    }while(ch =='Y'||ch=='y');
		    
		  }
	}

