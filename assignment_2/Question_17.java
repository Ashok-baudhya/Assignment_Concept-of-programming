package assignment_2;

public class Question_17 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=100;i<=200;i++)
		{
			if(i%7==0)
			{
				sum +=i;
			}
		}
		
		System.out.println();
		
		System.out.println("sum of all integers greater than 100 and less than 200 that are divisible by 7 = " + sum );

	}

}
