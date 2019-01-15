public class SpecialOffer {


    Product product;
    String discountDescription;
    int fromTo;
    double discount;

    public SpecialOffer(Product product, String discountDescription, int fromTo, double discount) {
        this.product = product;
        this.discountDescription = discountDescription;
        this.fromTo = fromTo;
        this.discount = discount;
    }
}
