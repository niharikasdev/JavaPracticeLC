
package practice;
import java.util.Scanner;

public class numberRevTwo 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number: ");
		long i=scan.nextInt();
		long rev=0; 
		
	      while(i != 0) 
	      {
	         long a = i % 10;
	         rev = rev * 10 + a;
	         i /= 10;
	      }
	      System.out.println("Reversed number is : " + rev);
	   }

}
