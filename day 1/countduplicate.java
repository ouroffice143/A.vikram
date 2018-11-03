import java.util.Scanner;

public class countduplicate 
{

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = input.nextInt();

		int[] a = new int[n];
		int[] b= new int[n];
		int[] c = new int[n];


		System.out.println("Enter array elements: ");
		for (int i = 0; i < a.length; i++) 
		{
		    a[i] = input.nextInt();
		    c[i]=1;
		   
		}
		for (int j = 0; j < a.length; j++) {
		    for (int i = j; i <a.length; i++) {
		        if (a[j] == a[i] && j != i) {
		            b[i] = a[i];
		            c[i]++;
		        }
		    }
		}



		for (int j = 0; j <  a.length; j++) 
		{
			 for (int i = j; i <a.length; i++)
			 {
			if(a[i]==b[i])
			{
		    System.out.println("\t" + a[i]  + "\t" + c[i]);
			}
			else
			{
				System.out.println("\t"+a[i]+"\t"+c[i]);
			}
		}
		}
		

	}
}


