package assignment_2;

public class Question_10 {

	public static void main(String[] args) {
		int j;
		for (int i=1; i<=9; i++)
        {
			if(i%2==0) {
				continue;
			}
            for (j=0; j<=9-i; j++)
            {
            	
                System.out.print(" ");
            }
            for(int k=j; k<=9; k++ ) {
            	System.out.print("*");
            }
            System.out.println();}
	
	}

}
