public class StoreProduct {
    public static void main(String[] args) {

        Store.setStoreDetails("ABC Store", "Chennai");

        Store store = new Store();

        Product p1 = new Product(101, "Laptop", 65000.0, 5);
        Product p2 = new Product(102, "Keyboard", 1500.0, 10);
        Product p3 = new Product(103, "Mouse", 800.0, 15);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}
