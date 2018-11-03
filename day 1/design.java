import java.util.Scanner;

public class design 
{

	public static void main(String[] args) 
	{
		
				Scanner s=new Scanner(System.in);
				System.out.println("enter the pattern size");
				 int d=s.nextInt();
				 for (int i=1; i<=d; i++) 
			     {  
				  for (int j=d-i; j>=1; j--) 
			      {  
			          System.out.print(" "); 
			      } 
			      for (int j=1; j<=i; j++ ) 
			      { 
			          System.out.print(i+" "); 
			      } 
			      System.out.println(); 
			  } 
			}
		
	}


