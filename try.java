class exceptionhandling
{
	public static void main(String args[])
	{
		int res;
		try{
			res=25/0;
			}
		catch(ArithmeticException e1)
		{	
			System.out.println("arithematic error occured");	
		}
		try{
			int a[]=new int[5];
			a[6]=9;
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("array out of bound occured");
		}
		    System.out.println("end of code");
	}
}
