package assignment_2;

public class Question_9 {

	public static void main(String[] args) {
		
		for (int i=0; i<4; i++)
        {
            for (int j=4-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
  
            System.out.println();
        }

	}

}
