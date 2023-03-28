package assignment_2;

public class Question_12 {

	public static void main(String[] args) {
		
		int space = 0;
		char ch ='A';
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++){
				System.out.print(ch);
				ch++;
			}
			for(int k=0;k<space;k++){
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{
				ch--;
				System.out.print(ch);
			}
			System.out.println();
			space++;
		}
	}
}
