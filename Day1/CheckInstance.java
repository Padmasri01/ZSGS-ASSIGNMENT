class A {}
class B extends A {}
class C{}

public class CheckInstance{
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj instanceof A); 
        System.out.println(obj instanceof B);
	//System.out.println(obj instanceof C);
	    String str = null;
	    System.out.println(str instanceof String);
	}

}