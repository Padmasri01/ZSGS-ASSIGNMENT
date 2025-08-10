/*2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for
two students having names "Sam" and "John" respectively*/

class Student2
{
	String name;
	int roll_no;
	long phone_no;
	String address;
	Student2(String name, int roll_no, long phone_no, String address)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.address = address;	
	}
	public void display()
	{
		System.out.print("Name: " + name + "\n" + "Roll No: " + roll_no + "\n" +  "Phone Number: " + phone_no + "\n" + "Address: " + address + "\n");
	}
	public static void main(String[] args)
	{
		Student2 obj1 = new Student2("Sam", 10, 9876543210l, "XYZ Street");
		Student2 obj2 = new Student2("John", 11, 8976543210l, "ABC Street");
		obj1.display();
		obj2.display();
	}
}