import java.util.*;
class shape
{
	double perimeter;
	double pi = 3.14;
	float a;
	float b;
	shape(float a)
	{
		this.a=a;
	}
	shape(float a,float b)
	{
		this.a=a;
		this.b=b;
	}
	void circlearea()
	{
		perimeter=2*pi*a;
		System.out.println("perimeter of circle = "+ perimeter);
	}
	void rectarea()
	{
		perimeter=2a+2b;
		System.out.println("perimeter of rectangle = "+ perimeter);
	}
	
	public static void main(String args[])
	{
		shape c=new shape(3);
		shape r = new shape(3,4);
		c.circlearea();
		r.rectearea();
		
	}
	
}

