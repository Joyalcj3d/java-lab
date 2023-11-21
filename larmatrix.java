import java.util.Scanner;
class arrsum
{
	public static void main(String args[])
	{
		int r,i,j;
		System.out.println("enter n");
		Scanner sc = new Scanner(System.in);
		r= sc.nextInt();
		System.out.println("enter elements");
		int a[][]=new int[r][r];
		for(i=0;i<r;i++)
			for(j=0;j<r;j++)
				a[i][j]=sc.nextInt();
		int s=a[0][0];
		for(i=0;i<r;i++)
			for(j=0;j<r;j++)
			{
				if(a[i][j]>s)
					s=a[i][j];
			}
		System.out.println("largest element of matrix is :");
		System.out.println(s);
	}
}

