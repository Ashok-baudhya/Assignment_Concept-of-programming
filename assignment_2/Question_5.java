package assignment_2;

public class Question_5 {

	public static void main(String[] args) {
		System.out.println("Armstrong numbers between 1 to 500"+"\n");
		for(int i=1;i<=500;i++)
		{
			int sum =0;
			int n = i;
			while(n!=0)
			{
				int rem = n%10;
					n=n/10;
					sum = (rem*rem*rem)+sum;
			}
			if(sum==i)
			{
			System.out.println(sum);
			}
			sum=0;
		}
		
		

	}

}
