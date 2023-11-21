import java.util.*;
class shape
{
	double area;
	double pi = 3.14;
	void area(float a)
	{
		area=pi*(a*a);
		System.out.println("area of circle  :" +area);
	}
	void area(int a,int b)
	{
		area=a*b;
		System.out.println("area of rectangle  :" +area);
	}
	void area(float a,float b)
	{
		area=(a*b)/2;
		System.out.println("area of triangle  :" +area);
	}
	public static void main(String args[])
	{
		shape c=new shape();
		c.area(3);
		c.area(7,5);
		c.area(4,5);
	}
	
}

