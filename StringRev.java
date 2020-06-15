package practice;


public class StringRev 
{

	public static void main(String[] args) 
	{
		String str="hello" ;
		char[] one=str.toCharArray();
		for(int i=one.length-1;i>=0;i--)
			System.out.print(one[i]);
		
	}

}
