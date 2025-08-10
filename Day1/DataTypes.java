class DataTypes{
	String name;
	int employeeId;
	byte age;
	short deptCode;
	long phoneNumber;
	float salary;
	//double ;
	char performanceRating;
	boolean isActive;
	public static void main(String[] args){
	DataTypes obj = new DataTypes();
	obj.name = "Sri";
	obj.employeeId = 1001;
	obj.age = 24;
	obj.deptCode = 10;
	obj.phoneNumber = 9876543210l;
	obj.salary = 10000;
	obj.performanceRating = 'A';
	obj.isActive = true;
	System.out.println("Employee Details");
	System.out.println("--------------------------------------------------------------------------------------------------------------");
	System.out.println("Name\t\tAge\tEmpId\tDept_Code\tRating\tIsActive\tSalary\t\tPhone Number");
	System.out.println(obj.name+"\t\t" +obj.age +"\t" +obj.employeeId+ "\t" + obj.deptCode + "\t\t" + obj.performanceRating+ "\t" +obj.isActive +"\t\t" +obj.salary +"\t\t" + obj.phoneNumber);	
}
}