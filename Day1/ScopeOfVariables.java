class ScopeOfVariables{
	static int staticVar; // static variable
	String name; //instance variable
	final String state = "Tamil Nadu" ; //final variable
	
	public void localVar(){
		int salary = 10000; //local variable
		System.out.println("Local Variable: " + salary);
	}

	
	public static void main(String[] args){
		staticVar = 10;
		System.out.println("Static Variable: " + staticVar);
		ScopeOfVariables obj = new ScopeOfVariables();
		obj.localVar();
		obj.name = "Sri";
		System.out.println("Local Variable: " + obj.name);
		System.out.println("Final Variable: " + obj.state);
	}
}
