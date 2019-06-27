import java.util.*;
class hunter11{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
		    StringBuffer sb=new StringBuffer(str[i]);
		    System.out.print(sb.reverse()+" ");
		}
	}
}
