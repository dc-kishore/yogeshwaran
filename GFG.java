import java.util.*;
class GFG {
    
    public static void fun(int a[],int n)
    {
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--)
        System.out.print(a[i]);
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    fun(a,n);
	}
}
