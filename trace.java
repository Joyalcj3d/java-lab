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
		int sum =0;
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		System.out.println("trace of  matrix is :");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				if(i==j)
					sum+=a[i][j];
			}
		}
		System.out.println(sum);
	}
}
