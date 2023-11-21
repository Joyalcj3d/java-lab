class fib
{
	public  static void main(String args[])
	{
	int n=356,k=0,r=0;
	while(n>0)
	{
		r = n%10;
		k=k*10 + r;
		n=n/10;
	}
	System.out.println(k);
	}
}
