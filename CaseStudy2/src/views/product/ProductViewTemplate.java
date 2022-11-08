package views.product;

import model.Product;
import services.ProductServices;
import views.View;

import java.util.List;

public abstract class ProductViewTemplate extends View {
    protected ProductServices productServices;
    public ProductViewTemplate(){
        productServices = new ProductServices();
    }
    public void showProduct(List<Product> listProducts){
        for (Product product : listProducts){
            System.out.println(product);
        }
    }
}
