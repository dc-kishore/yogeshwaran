/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class hunter8.java {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	    for(int j=i;j<n;j++)
	    {
	        if(i<j)
	        {
	            for(int k=j;k<n;k++)
	            {
	                if(j<k)
	                {
	                    if(i<k)
	                    {
	                        if(a[i]+a[j]==a[k])
	                        {
	                            System.out.print(a[i]+" "+a[j]+" "+a[k]);
	                            System.out.println();
	                        }
	                        }
	                    }
	                }
	            }
	        }
	        
	    }
	 }
	    
}
