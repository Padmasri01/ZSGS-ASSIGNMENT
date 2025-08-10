/*1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of
roll_no as '2' and that of name as "John" by creating an object of the class Student.*/

class Student
{
	String name;
	int roll_no;
	public static void main(String[] args)
	{
		Student obj = new Student();
		obj.name = "John";
		obj.roll_no = 2;
		System.out.println("Student Name: "+obj.name);
		System.out.println("Roll No.: "+obj.roll_no);
	}
}