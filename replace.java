import java.util.Scanner;
class arrsum
{
	public static void main(String args[])
	{
		int n,j;
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		System.out.println("enter elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter new element and position");
		int as = sc.nextInt();
		int pos = sc.nextInt();	
		for(j=0;j<n;j++)
		{
			if(j==pos-1)
			a[j]=as;			
		}
		System.out.println("replaced array is :");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}

