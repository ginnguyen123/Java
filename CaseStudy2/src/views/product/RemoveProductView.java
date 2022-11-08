package views.product;

import services.ProductServices;

public class RemoveProductView extends ProductViewTemplate {
    public RemoveProductView(){
        super();
    }

    @Override
    public void showBody() {
        System.out.println("> Remove product.");
        showProduct(ProductServices.getProducts());
        System.out.print("Enter ID: ");
        long idProduct = scanner.nextLong();
        if (ProductServices.isFindID(idProduct))
            ProductServices.removeProduct(ProductServices.findID(idProduct));
        else
            System.out.println("ID "+ idProduct + "don't exist!");
    }
}
