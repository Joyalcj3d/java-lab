import java.util.Scanner;
class fib
{
	public  static void main(String args[])
	{
	int n,a=0,b=1,t;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	for(int i =1;i<=n;i++)
	{
	if(i ==1)
		System.out.println(a);
	else if(i==2)	
		System.out.println(b);
	else 
	{
		System.out.println(a+b);
		t=a+b;
		a= b;
		b = t;	

	}	
	
	}

	}
}
