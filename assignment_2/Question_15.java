package assignment_2;

public class Question_15 {

	public static void main(String[] args) {
		
		System.out.println("Prime number 2 to 20 - ");
		System.out.println();
		for(int i=2;i<20;i++)
		{
			int count =0;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0) count++;
			}
			if(count==0)
				System.out.println(i);
		}

	}

}
