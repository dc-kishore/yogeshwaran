import java.util.*;
class hunter3 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
		    if(a[i]==i)
		    {
		        System.out.print(a[i]+" ");
			    flag=1;
		    }
		}
		if(flag=0)
		{
			System.out.print("-1");
		}
	}
}
