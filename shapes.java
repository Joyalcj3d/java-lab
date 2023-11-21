abstract class shape
{
	
	 abstract void numberofsides();
}
class rectangle extends shape
{
	void numberofsides()
{
	 System.out.println("the number of sides in rectangle is 4");
}
}
class circle extends shape
{
	void numberofsides()
{
	 System.out.println("the number of sides in circle is zero");
}
}
class hexagon extends shape
{	
	void numberofsides()
{
	 System.out.println("the number of sides in hexagon is 6");
}
}

class shapes
{
	public static void main(String args[])
	{
	rectangle r=new rectangle();
	hexagon h=new hexagon();
	circle c=new circle();
	r.numberofsides();
	h.numberofsides();
	c.numberofsides();
	}
}
