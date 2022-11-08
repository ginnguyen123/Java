package views.product;

import model.Product;
import services.ProductServices;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class AddProductView extends ProductViewTemplate {
    public AddProductView(){
        super();
    }
    public Scanner scanner = new Scanner(System.in);
    @Override
    public void showBody() {
        System.out.println("> Add product.");
        //Product(long id, String name, int quantitys, float prices, Date dateCreated,
        //                   Date dateUpdated, String madeIn, String desinBy)
        long idProduct = System.currentTimeMillis()%10000;
        System.out.print("Product name: ");
        String productName = scanner.nextLine();
        System.out.print("Quantitys: ");
        int quantitys = Integer.parseInt(scanner.nextLine());
        System.out.print("Prices: ");
        float prices = Float.parseFloat(scanner.nextLine());
        System.out.print("Made in: ");
        String madeIn = scanner.nextLine();
        System.out.print("xDesign by: ");
        String desinBy = scanner.nextLine();
        Date dateCreated = new Date();
        Instant dateUpdated = Instant.now();
        Product product = new Product(idProduct, productName, quantitys, prices, dateCreated, dateUpdated, madeIn, desinBy);
        ProductServices.addProduct(product);
        showProduct(ProductServices.getProducts());
    }
}
