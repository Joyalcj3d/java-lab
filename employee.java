import java.util.*;
class employee
{
	String name;
	int empno;
	int phno;
	employee(int empno,String name,int phno)
	{
		this.empno=empno;
		this.name= name;
		this.phno=phno;
	}
	void display()
	{
		System.out.println("name  :" +name);
		System.out.println("emp no : "+empno);
		System.out.println("ph no : "+phno);
	}
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		employee e[]=new employee[5];
		String name;
		int empno,phno;
		for(int i=0;i<5;i++)
		{
			System.out.println("enter name");
			name = sc.next();
			System.out.println("enter empno and phno");
			empno = sc.nextInt();
			phno = sc.nextInt();
			e[i]=new employee(empno,name,phno);
		}
		for(int i=0;i<5;i++)
		{
			e[i].display();
		}
	}
}

