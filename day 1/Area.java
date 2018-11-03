import java.util.Scanner;

public class Area {
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int l=sc.nextInt();
	int b=sc.nextInt();
	int area= l*b;
	System.out.println("are of the rectangle");
	System.out.println(area);
	System.out.println("perimeter of the rectangle");
	System.out.println(2*(l+b));
	System.out.println("area of the circle");
	int r=sc.nextInt();
	System.out.println("area of the circle");
	System.out.println(0.5*3.14*r*r);
	System.out.println("circumference of the circle");
	System.out.println(2*3.14*r);
	
}
}

