class ExplicitTypeCasting{
 	public static void main(String[] args){
		int a = 10;
		byte b = (byte)a; //store integer value(a) in byte(b) using explicit conversion
		System.out.println("Narrowing: Int to byte");
		System.out.println("Int: " + a);
		System.out.println("Byte: " + b);

		int c = 10;
		String result = String.valueOf(c);// int to string
		System.out.println(result);
		int d = Integer.parseInt(result);//String to int
		System.out.println(d);	
	}
}