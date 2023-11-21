import java.util.Scanner;
class arrsum
{
	public static void main(String args[])
	{
		int n;
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		System.out.println("enter elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int sum=0;
		for(int j=0;j<n;j++)
			sum = sum + a[j];
		System.out.println("sum of array is :");
		System.out.println(sum);
	}
}
-
