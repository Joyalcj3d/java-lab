import java.util.Scanner;
class arrsum
{
	public static void main(String args[])
	{
		int r,c,i,j;
		System.out.println("enter row and column");
		Scanner sc = new Scanner(System.in);
		r= sc.nextInt();
		c= sc.nextInt();	
		System.out.println("enter elements of matrix a");
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int d[][]=new int[r][c];
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		System.out.println("enter elements of matrix b");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				b[i][j]=sc.nextInt();
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
			{
				d[i][j]=a[i][j]+b[i][j];
			}
		System.out.println("added  matrix is :");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(d[i][j]+"   ");
			}
			System.out.println();
		}
	}
}

