import java.util.*;
class hunter10 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		int count=0;
		for(int i=0;i<n1;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n2;i++)
		b[i]=sc.nextInt();
		for(int i=0;i<n2;i++)
		{
		    for(int j=0;j<n1;j++)
		    {
		        if(b[i]==a[j])
		        {
		            count++;
		        }
		    }
		}
		if(count==n2)
		{
		    System.out.print("YES");
		}
		else
		{
		    System.out.print("NO");
		}
	}
}
