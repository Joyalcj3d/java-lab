import java.util.Scanner;
class arrsum
{
	public static void main(String args[])
	{
		int r,c,i,j,k;
		System.out.println("enter row and column");
		Scanner sc = new Scanner(System.in);
		r= sc.nextInt();
		c= sc.nextInt();
		int m = sc.nextInt();	
		System.out.println("enter elements of matrix a");
		int a[][]=new int[r][c];
		int b[][]=new int[c][m];
		int d[][]=new int[r][m];
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		System.out.println("enter elements of matrix b");
		for(i=0;i<c;i++)
			for(j=0;j<m;j++)
				b[i][j]=sc.nextInt();
		for(i=0;i<r;i++)
		{	for(j=0;j<m;j++)
			{
				d[i][j]=0;
				for(k=0;k<c;k++)
					d[i][j]+=a[i][k]*b[k][j];
			}
		}
		System.out.println("multiplied  matrix is :");
		for(i=0;i<r;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(d[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
