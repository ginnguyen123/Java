package views.product;

import model.Product;
import services.ProductServices;
import views.View;

public class ProductView extends View {
    private ProductServices productServices;
    public ProductView(){
        productServices = new ProductServices();
    }

    @Override
    public void showBody() {
        for (Product product : productServices.getProducts()){
            System.out.println(product);
        }
    }
}
