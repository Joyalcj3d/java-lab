import java.util.*;
class employee
{
	String name;
	int age;
	int phno;
	String address;
	int salary;
	void display()
	{
		System.out.println("name  :" +name);
		System.out.println("age : "+age);
		System.out.println("ph no : "+phno);
		System.out.println("address  :" +address);
		System.out.println("salary is : "+salary);
	}
	void read()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter age");
		age = sc.nextInt();
		System.out.println("enter phone number");
		phno=sc.nextInt();
		System.out.println("enter address");
		address = sc.next();
		System.out.println("enter salary");
		salary = sc.nextInt();
	}	                      
}
class Officer extends employee
{
	Scanner sc = new Scanner(System.in);
	String specialization;
	String department;
	void offread()
	{
		System.out.println("enter specialization and department");
		specialization = sc.next();
		department = sc.next();

	}
}
class Manager extends employee
{	Scanner sc = new Scanner(System.in);
	String specialization;
	String department;
	void managread()
	{
		System.out.println("enter specialization and department");
		specialization = sc.next();
		department = sc.next();

	}
}
class prg
{
public static void main(String args[])
{
	int choice;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1 : Officer and 2: Manager");
	choice = sc.nextInt();
	if(choice == 1)
	{Officer e1=new Officer();
	System.out.println("enter details of the officer");
	e1.read();
	e1.offread();
	e1.display();
	}else if (choice == 2)
	{
	Manager e2=new Manager();
	System.out.println("enter details of the manager");
	e2.read();
	e2.managread();
	e2.display();
	}
}
}
