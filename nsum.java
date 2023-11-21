import java.util.Scanner;
class fib
{
	public  static void main(String args[])
	{
	int n,sum =0;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	sum = (n*(n+1))/2;
	System.out.println("sum of " + n +" natural numbers is  " + sum);

	}
}
