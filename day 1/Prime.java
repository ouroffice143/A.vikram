import java.util.Scanner;

public class Prime{    
 public static void main(String args[])
 {   
	 Scanner sc= new Scanner(System.in);
  int m=0,g=0;  
  System.out.println("enter the value");
  int n=sc.nextInt(); 
  m=n/2;      
  if(n==0||n==1)
  {  
   System.out.println(n+" is not prime number");      
  }else
  {  
   for(int i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     g=1;      
     break;      
    }      
   }      
   if(g==0)  
   { System.out.println(n+" is prime number"); }  
  }
}    
}   
