package practice;

import java.util.*;
import java.io.*;
public class Arrayind
{
	public static void main(String args[])
	{
		int ar[]={1,2,3,4,5,6};
		int t;
		int[] opnew=Arrayind.indiceCal(ar,7);
		System.out.println("["+opnew[0]+"]+["+opnew[1]+"]");
		int[] opnew1=Arrayind.indiceCal(ar,5);
		System.out.println("["+opnew1[0]+"]+["+opnew1[1]+"]");	
	
	}
	public static int[] indiceCal(int ar[], int t)
	{
		int x,y;
		int op[]=new int[7]; 
		int sumcal=0;                          //n is length of string
		for(x=0; x<ar.length; x++)
		{
			for(y=x+1;y<ar.length;y++)
			{
				if(ar[x]+ar[y]==t)
				{
					op[0]=x;
					op[1]=y;
				}	
			}	
		}
		return op;
	
	}
}
