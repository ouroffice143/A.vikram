import java.util.Scanner;

public class Reverse 
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int  a[];
	a = new int[n];
	for(int i=0; i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}

}
}
