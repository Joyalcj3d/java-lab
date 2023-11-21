import java.util.Scanner;
class factor
{
	public  static void main(String args[])
	{
	int n;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
		}	
	}
	}
}
