package practice;


public class containDup
{
	
	public static void main(String[] args) 
    { 
		int[] len= {1,2,3,4};
	
		boolean s=true;
	
		for(int i=0; i<len.length-1;i++) {
			for(int j=0;j<i;j++) {
			if(	len[i]== len[j]){
				s =false;
			}			
				
			}
		}
		System.out.println(s);
		
	}
	
}
