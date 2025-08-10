/*2. Can we override private method, constructor, static method, final method? Illustrate with an example.*/

class MethodOverriding
{
	private void methodPrivate()
	{
		System.out.println("Private method in parent class");
	}
	public void getPrivate()
	{
		methodPrivate();
	}

	MethodOverriding()
	{
		System.out.println("Constructor in parent class");
	}

	static void staticMethod()
	{
		System.out.println("Static in parent class");
	}

	final void finalMethod()
	{
		System.out.println("Final method in parent class");
	}
}

class MethodOverridingChild extends MethodOverriding
{
	private void methodPrivate()
	{
		System.out.println("Private method in child class");
	}
	public void getPrivate()
	{
		methodPrivate();
	}

	/*MethodOverriding()
	{
		System.out.println("Constructor in child class"); //error: invalid method declaration; return type required
	}*/

	static void staticMethod()
	{
		System.out.println("Static in child class");
	}

	/*final void finalMethod()
	{
		System.out.println("Final method in child class"); //finalMethod() in MethodOverridingChild cannot override finalMethod() in MethodOverriding
	}*/
}

class MethodOverridingTest
{
	public static void main(String[] args)
	{
		MethodOverriding obj1 = new MethodOverriding();
		MethodOverridingChild obj2 = new MethodOverridingChild();

		obj1.getPrivate();
		obj2.getPrivate();

		obj1.staticMethod();
		obj2.staticMethod();

		obj1.finalMethod();
		obj2.finalMethod();
		
	}
}