import java.util.*;
class pallendrom
{
public static void main(String args[])
{
int i,l,flag=0;

Scanner sc = new Scanner(System.in);
System.out.println("enter the string");
String a=sc.next();
System.out.println("enter character to be searched and character to be replaced");
char c = sc.next().charAt(0);
char r = sc.next().charAt(0);

String replaced =a.replace(c,r);

System.out.println(replaced);
}
}
