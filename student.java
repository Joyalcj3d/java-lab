import java.util.*;
class Student
{
	String name;
	int rollno;
	int marks[]=new int[5];
	void read()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter name");
	name = sc.nextLine();
	System.out.println("enter rollno");
	rollno = sc.nextInt();
	System.out.println("enter marks");
	for(int i=0;i<5;i++)
		marks[i]=sc.nextInt();
	}
	void display()
	{
		System.out.println("name  :" +name);
		System.out.println("roll no : "+rollno);
		for(int i=0;i<5;i++)
			System.out.println("mark of subject "+i+" :"+marks[i]);
	}
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.read();
		s1.display();
	}
}

