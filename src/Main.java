public class Main {

    public static void main(String[] args) {

        Category category1 = new Category("Chipsy", "chipsy, popcorn, prazynki");
        Category category2 = new Category("Czekoladowe", "Słodycze zawierające czekolade");


        Product product1 = new Product("Lays", 3.20, "Suszone plasterki ziemniaków", category1);
        Product product2 = new Product("Snickers", 1.80, "Baton z orzeszkami i nugatem w karmelu", category2);
        Product product3 = new Product("Chupa chups", 0.90, "Produkt cukierniczy przeznaczony do lizania");

        SpecialOffer so = new SpecialOffer(product2, "20% mniej do konca tygodnia", 7, 0.2);

        System.out.println("Kategoria " + category1.name + " to: " + category1.categoryDescription + ". Na przykład: " +
                product1.productName + ", czyli "+ product1.productDescription + ". Ich koszt to "+product1.price+ " PLN");
        System.out.println();

        System.out.println("Kategoria " + category2.name + " to: " + category2.categoryDescription + ". Na przykład: " +
                product2.productName + ", czyli "+ product2.productDescription + ". Ich koszt to "+product2.price+ " PLN");
        System.out.println();

        System.out.println("Specjalna promocja: "+so.discountDescription + " na produkt " + product2.productName +
                " obowiązuje przez " + so.fromTo + " dni");
        System.out.println();

        System.out.println("Produkt "+product3.productName + " kosztuje " + product3.price + " PLN, i jest to " +
                product3.productDescription+".");

    }
}
