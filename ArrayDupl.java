package practice;



public class ArrayDupl 
{

	public static void main(String[] args) 
	{
		
        int ary[] = { 1, 1, 2, 2, 3, 4, 4,4, 5, 5, 6, 7, 7,8};
		int len = ary.length;
		int temp[] = new int[ary.length];
        int j = 0;
        for (int i = 0; i < len - 1; i++) 
		{

			if (ary[i] != ary[i + 1]) 
			{

				temp[j] = ary[i];
				j++;

			}

		}
		temp[j++]=ary[len-1];
		for(int k=0;k<j;k++) 
		{
		 				
			  
			  System.out.print(temp[k]);
		 				
		}
	}
}
