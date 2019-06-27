import java.util.*;
class hunt5 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int u=1;
		for(int i=0;i<n.length()-1;i++)
		{
		    String s=Character.toString(n.charAt(i))+Character.toString(n.charAt(i+1));
		    int p=Integer.parseInt(s);
		    if((p<=26)&& n.charAt(i)!='0')
		    u+=1;
		}
		if(u==3)
		System.out.print(u);
		else
		System.out.print(u+(u-1)/2); 
	}
}
