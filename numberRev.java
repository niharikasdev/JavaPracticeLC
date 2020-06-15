package practice;

public class numberRev 
{
	public static void main(String[] args) 
	{
	      int i = 768, rev = 0;
	      while(i != 0) 
	      {
	         int a = i % 10;
	         rev = rev * 10 + a;
	         i /= 10;
	      }
	      System.out.println("Reversed number is : " + rev);
	   }
	

}
