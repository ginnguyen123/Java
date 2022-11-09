package views.product;

import model.Product;
import services.ProductServices;
import sort.SortByNameProductAtoZ;
import sort.SortByNameProductZtoA;
import sort.SortByPriceProductDecrease;
import sort.SortByPriceProductIncrease;

import java.util.Comparator;

public class SortProducView extends ProductViewTemplate{
    @Override
    public void showBody() {
        System.out.println(">Sort products: ");
        System.out.println("1.Sort by name product (A - Z).");
        System.out.println("2.Sort by name product (Z - A).");
        System.out.println("3.Sort by prices product increase.");
        System.out.println("4.Sort by prices product decrease.");
        System.out.print(">>Choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        Comparator<Product> comparator;
        switch (choice){
            case 1:
                comparator = new SortByNameProductAtoZ();
                ProductServices.sortByProductName(comparator);
                break;
            case 2:
                comparator = new SortByNameProductZtoA();
                ProductServices.sortByProductName(comparator);
                break;
            case 3:
                comparator = new SortByPriceProductIncrease();
                ProductServices.sortByProductPrice(comparator);
                break;
            case 4:
                comparator = new SortByPriceProductDecrease();
                ProductServices.sortByProductPrice(comparator);
            break;

        }
        showProduct(ProductServices.getProducts());
    }
}
