class Product {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.productId = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println(productId + "\t\t|\t" + name + "\t\t|\t" + quantity + "\t\t|\t" + price);
    }
}
