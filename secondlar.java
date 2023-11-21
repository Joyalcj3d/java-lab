import java.util.Scanner;
class arrsum
{
	public static void main(String args[])
	{
		int n,pos=0;
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		System.out.println("enter elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int s=a[0];
		for(int j=0;j<n;j++)
		{
			if (a[j]>s)
			{	s = a[j];
				pos = j;
			}			
		}
		a[pos]=0;
		s=0;
		for(int j=0;j<n;j++)
		{
			if (a[j]>s)
			{	s = a[j];
			}			
		}
		System.out.println("second largest  element of array is :");
		System.out.println(s);
	}
}

