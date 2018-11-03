

import java.util.Scanner;

public class Sortoddeven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		 int temp=0;
		 int i=s.nextInt();
		 int a[]= new int[i];
		 System.out.println("enter array values");
		 for(int j=0; j<i; j++) {
			 a[j]=s.nextInt();
		 }
		 for(int j=0; j<i; j++) {
				 for(int j1=0; j1<i; j1++) {
				 if(a[j]<a[j1]) {
					temp=a[j];
					a[j]=a[j1];
					a[j1]=temp;
				 }
				 }
				 }
		 System.out.print("Ascending Order:");
	        for (int j = 0; j < i; j++) 
	        {
	            System.out.print(a[j] + ",");
	        }
			 System.out.println(" ");
		 for(int j=0; j<i; j++) {
		 if((a[j]%2!=0)&&(a[j]%2==0)) {
			 System.out.print(a[j]+" ");
		 } 
		 }
		 for(int j=i-1; j>=0; j--) {
			 if(a[j]%2==0) {
				 System.out.print(" "+a[j]);
			 } 
		 }
	}
}