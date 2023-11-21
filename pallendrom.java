import java.util.*;
class pallendrom
{
public static void main(String args[])
{
int i,l,j,flag=0;

Scanner sc = new Scanner(System.in);
String a=sc.next();
l= a.length()-1;
for(i=0;i<l;i++)
{		
	if(a.charAt(i)!=a.charAt(l-i))
	{
		flag = 1;
		break;
	}
}
if(flag==0)
	System.out.println("is pallendrom");
else
	System.out.println("is not pallendrom");
	
}
}
