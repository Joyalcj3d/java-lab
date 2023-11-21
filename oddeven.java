import java.util.Scanner;
class check
{
	public  static void main(String args[])
	{
	int n,i,flag=0;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	
	if(n%2!=0)
	{
		flag =1;	
	}	
	if(flag==0)
	System.out.println(n + " is even");
	else if(flag==1)
	System.out.println(n + " is odd");
		
	}
}  
