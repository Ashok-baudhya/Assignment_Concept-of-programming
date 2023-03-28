package assignment_2;

public class Question_11 {

	public static void main(String[] args) {
		int count=0;
		int j;
		for (int i=1; i<=9; i++)
        {
			if(i%2==0) {
				continue;
			}
            for (j=1; j<=9-i; j++)
            {
            	
                System.out.print(" ");
            }
            count++;
            for(int k=j; k<=9; k++ ) {
            	System.out.print(count);
            }
            System.out.println();
        }

	}

}
