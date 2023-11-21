import java.util.Scanner;
class fib
{
	public  static void main(String args[])
	{
	int n,flag =1;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	for(int i=2;i<=n/2;i++)
	{
	if(n%i==0)
	{
	flag =0;
	break;	
	}	
	}
	if(flag == 0)
		System.out.println("is not prime");
	else 
		System.out.println("is prime");

	}
}
