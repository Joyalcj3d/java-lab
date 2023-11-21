import java.util.Scanner;
class factor
{
	public  static void main(String args[])
	{
	int n,fac=1;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		fac = fac*i;
	}
	System.out.println("factorial of  " + n + "is :" +fac);
	}
}
