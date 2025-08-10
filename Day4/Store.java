import java.util.ArrayList;
import java.util.List;

class Store {
    static String storeName;
    static String storeLocation;
    List<Product> productList = new ArrayList<>();


    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }


    static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
    }


    void addProduct(Product product) {
        productList.add(product);
    }


    void displayAllProducts() {
        System.out.println("\nProduct_ID\t|\tProduct_Name\t|\tQuantity\t|\tPrice");
        System.out.println("--------------------------------------------------------------");
        for (Product p : productList) {
            p.displayProduct();
        }
    }
}
