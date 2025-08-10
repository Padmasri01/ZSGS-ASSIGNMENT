/* Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated. */

import java.util.ArrayList;
import java.util.List;

class Store
{
	//storeName and storeLocation as static variables since they are common to all products in the store.
	static String storeName;
	static String storeLocation;
	//A static method setStoreDetails(String name, String location) to initialize the static variables.
	static void setStoreDetails(String name, String location)
	{
		storeName = name;
		storeLocation = location;
	}
	//A static method displayStoreDetails() to print store details.
	static void displayStoreDetails(){
		System.out.println("Store Name: " + storeName);
		System.out.println("Store Location: " + storeLocation);
	}
	List<Product> productObj = new ArrayList<>();
	public void addProduct(Product product)
	{
		productObj.add(product);
	}
	public void displayProduct()
	{
		System.out.print("Product_ID\t|\tProduct_Name\t\t|\tQuantity\t|\tPrice\n");
		for (Product a : productObj) {
			System.out.print(a.productid + "\t\t|\t" +  a.name + "\t\t\t|\t" + a.quantity + "\t\t|\t" + a.price +"\n");
		}

	}
	
}
class Product
{
	int productid;
	String name;
	double price;
	int quantity;
	Product(int productid, String name, double price, int quantity)
	{
		this.productid = productid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
}
class GroceryStore
{
	public static void main(String[] args)
	{
		Store.setStoreDetails("ABC Store", "Surandai");
		Store store = new Store();
		Product product1 = new Product(01, "Biscuit", 20, 2);
		Product product2 = new Product(02, "Chocolate", 10, 2);
		Product product3 = new Product(03, "Milk", 50, 1);
		Product product4 = new Product(04, "Sugar", 40, 2);
		Product product5 = new Product(05, "Bread", 30, 2);
		store.addProduct(product1);
		store.addProduct(product2);
		store.addProduct(product3);
		store.addProduct(product4);
		store.addProduct(product5);

		Store.displayStoreDetails();
		store.displayProduct();
		
           		 
        	
	}
}