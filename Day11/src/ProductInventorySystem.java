/*5. Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
        --->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
        --->Add a Product: Accept product details from the user and write the object to a file (products.dat).
        --->View All Products: Read all product objects from the file and display them.
        --->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to
the file.
        --->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
        --->Use proper exception handling and ensure that object serialization and deserialization are handled safely and
        efficiently*/

import java.io.*;
import java.util.*;

class Product implements Serializable {

    int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}

public class ProductInventorySystem {
    static final String FILE_NAME = "products.dat";

    public static void addProduct(Product p) throws IOException {
        List<Product> products = readAllProducts();
        products.add(p);
        writeAllProducts(products);
        System.out.println("Product added successfully.");
    }

    public static List<Product> readAllProducts() {
        List<Product> products = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            products = (List<Product>) ois.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return products;
    }

    public static void writeAllProducts(List<Product> products) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(products);
        }
    }

    public static void viewAllProducts() {
        List<Product> products = readAllProducts();
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            products.forEach(System.out::println);
        }
    }

    public static void searchProductById(int id) {
        List<Product> products = readAllProducts();
        for (Product p : products) {
            if (p.productId == id) {
                System.out.println("Product found: " + p);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public static void updateProduct(int id, double newPrice, int newQuantity) throws IOException {
        List<Product> products = readAllProducts();
        boolean found = false;
        for (Product p : products) {
            if (p.productId == id) {
                p.price = newPrice;
                p.quantity = newQuantity;
                found = true;
                break;
            }
        }
        if (found) {
            writeAllProducts(products);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void deleteProduct(int id) throws IOException {
        List<Product> products = readAllProducts();
        boolean removed = products.removeIf(p -> p.productId == id);
        if (removed) {
            writeAllProducts(products);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nProduct Inventory Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    addProduct(new Product(id, name, price, qty));
                    break;
                case 2:
                    viewAllProducts();
                    break;
                case 3:
                    System.out.print("Enter product ID to search: ");
                    searchProductById(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter product ID to update: ");
                    id = sc.nextInt();
                    System.out.print("Enter new price: ");
                    price = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    qty = sc.nextInt();
                    updateProduct(id, price, qty);
                    break;
                case 5:
                    System.out.print("Enter product ID to delete: ");
                    deleteProduct(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}



