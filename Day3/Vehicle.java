class Vehicle
{
	int vehicleID;
	String brand_name;
	static int count = 0;
	double price;
    {
		count++;
	}
	Vehicle(int vehicleID, String brand_name, double price)
	{
		this.vehicleID = vehicleID;
		this.brand_name = brand_name;
		this.price = price;
	}
	public void display()
	{
		System.out.print("Vechicle Id: " + vehicleID + "\n" + "Brand Name: "+ brand_name + "\n" + "Price: " + price + "\n");
	}
	
	public static void main(String[] args)
	{
		Vehicle obj = new Vehicle(1001, "Honda", 800000);
		obj.display();
		Vehicle obj2 = new Vehicle(1002, "Honda", 800000);
		obj2.display();	
		System.out.println(Vehicle.count);
	}
}