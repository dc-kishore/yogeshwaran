import java.util.*;
class hunter9 {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int min=100;
		int c=0,d=0,sum=0;
		for(int i=0;i<n-1;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		    sum=a[i]+a[j];
		    if(Math.abs(sum)<min)
		    {
		        min=Math.abs(sum);
		        c=a[i];
		        d=a[j];
		    }
		    }
		}
		System.out.print(c+" "+d);
	}
}
