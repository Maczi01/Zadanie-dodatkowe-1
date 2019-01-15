public class Product {

    String productName;
    double price;
    String productDescription;
    Category category;

    public Product(String productName, double price, String productDescription) {
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
    }



    public Product(String productName, double price, String productDescription, Category category) {
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.category = category;
    }



}
