/*1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.*/



class Vehicle
{
	double mileage;
	double price;

	Vehicle(double mileage, double price)
	{
		this.mileage = mileage;
		this.price = price;
	}
}

class Car extends Vehicle
{
	double ownerShipCost;
	int warranty;
	int noOfSeats;
	String fuelType;

	Car(double mileage, double price, double ownerShipCost, int warranty, int noOfSeats, String fuelType)
	{
		super(mileage, price);
		this.ownerShipCost = ownerShipCost;
		this.warranty = warranty;
		this.noOfSeats = noOfSeats;
		this.fuelType = fuelType;
	}
}

class Bike extends Vehicle
{
	int noOfCylinders;
	int noOfGears;
	String coolingType;
	String wheelType;
	int fuelTankSize;

	Bike(double mileage, double price, int noOfCylinders,int noOfGears, String coolingType,String wheelType,int fuelTankSize )
	{
		super(mileage, price);
		this.noOfCylinders = noOfCylinders;
		this.noOfGears = noOfGears;
		this.coolingType = coolingType;
		this.wheelType = wheelType;
		this.fuelTankSize = fuelTankSize;
	}

}

class Audi extends Car
{
	String modelType;

        Audi( double mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) 
	{
        	super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        	this.modelType = modelType;
        }

       	void display() 
	{
        	System.out.println("Audi Model: " + modelType);
        	System.out.println("Ownership Cost: " + ownerShipCost);
        	System.out.println("Warranty (years): " + warranty);
        	System.out.println("Seating Capacity: " + noOfSeats);
        	System.out.println("Fuel Type: " + fuelType);
        	System.out.println("Mileage: " + mileage );
        	System.out.println("Price: " + price);
    	}
}

class Ford extends Car
{
	String modelType;

        Ford( double mileage, double price, double ownershipCost, int warranty, int seatingCapacity, String fuelType, String modelType) 
	{
        	super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        	this.modelType = modelType;
        }

       	void display() 
	{
        	System.out.println("Ford Model: " + modelType);
        	System.out.println("Ownership Cost: " + ownerShipCost);
        	System.out.println("Warranty (years): " + warranty);
        	System.out.println("Seating Capacity: " + noOfSeats);
        	System.out.println("Fuel Type: " + fuelType);
        	System.out.println("Mileage: " + mileage );
        	System.out.println("Price: " + price);
    	}
}

class Bajaj extends Bike 
{
	String makeType;
	
	Bajaj(double mileage, double price, int noOfCylinders, int noOfGears, String coolingType, String wheelType, int fuelTankSize,String makeType) 
	{
        	super(mileage, price, noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize);
        	this.makeType = makeType;
        }

    	void display() 
	{
        	System.out.println("Bajaj Make: " + makeType);
        	System.out.println("Cylinders: " + noOfCylinders);
        	System.out.println("Gears: " + noOfGears);
        	System.out.println("Cooling Type: " + coolingType);
        	System.out.println("Wheel Type: " + wheelType);
        	System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        	System.out.println("Mileage: " + mileage );
        	System.out.println("Price: " + price);
        }
}

class TVS extends Bike 
{
	String makeType;
	
	TVS(double mileage, double price, int noOfCylinders, int noOfGears, String coolingType, String wheelType, int fuelTankSize ,String makeType) 
	{
        	super(mileage, price, noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize);
        	this.makeType = makeType;
        }

    	void display() 
	{
        	System.out.println("TVS Make: " + makeType);
        	System.out.println("Cylinders: " + noOfCylinders);
        	System.out.println("Gears: " + noOfGears);
        	System.out.println("Cooling Type: " + coolingType);
        	System.out.println("Wheel Type: " + wheelType);
        	System.out.println("Fuel Tank Size: " + fuelTankSize);
        	System.out.println("Mileage: " + mileage );
        	System.out.println("Price: " + price);
        }
}

public class VehiclesTest
{
	public static void main(String[] args)
	{
		Audi audi = new Audi( 15.5, 4500000, 200000, 4, 5, "Petrol", "A4");
        Ford ford = new Ford( 12.3, 3500000, 180000, 3, 7, "Diesel","Endeavour");

        Bajaj bajaj = new Bajaj( 40.0, 125000, 1, 5, "Air", "Alloys", 13, "Pulsar 220F");
        TVS tvs = new TVS( 45.0, 110000, 1, 5, "Oil", "Spokes", 12,"Apache RTR 160");

        System.out.println("----- Car Information -----");
        audi.display();
        System.out.println();
        ford.display();

        	System.out.println("\n----- Bike Information -----");
        	bajaj.display();
        	System.out.println();
        	tvs.display();
		
	}
}