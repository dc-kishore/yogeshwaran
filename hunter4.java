import java.util.*;
class hunter4{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		Arrays.sort(a);
		int n1=0;
		for(int i=0;i<n-1;i++)
		{
		    if(a[i]!=a[i+1])
		    {
		        n1=a[i];
		        break;
		    }
		}
		if(n1==0)
		{
		    System.out.print("-1");
		}
		else{
		    System.out.print(n1);
		}
	}
}
