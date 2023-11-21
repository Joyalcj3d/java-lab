import java.util.*;
class pallendrom
{
public static void main(String args[])
{
int i,l,frequency=0;

Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String a=sc.next();
System.out.println("enter character to be searched");
char c = sc.next().charAt(0);
l= a.length()-1;
for(i=0;i<l;i++)
{		
	if(a.charAt(i)==c)
	{
		frequency++;
	}
}
System.out.println("frequency of character is "+ frequency);
}
}
