package Assignment_4;

public class func {
	
	void cube(int a){
		System.out.println("Cube = "+a*a*a);
	}
	
	void square(int b){
		System.out.println("Square = "+b*b);
	}
	
	void greater(int a,int b,int c)
	{
		if(a>b && a>c){
			System.out.println(a+" is greater");
		}
		else if(b>c){
			System.out.println(b+" is greater");
		}
		else{
			System.out.println(c+" is greater");
		}	
	}
}
