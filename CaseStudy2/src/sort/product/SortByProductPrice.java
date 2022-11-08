package sort.product;

import model.Product;

import java.util.Comparator;

public class SortByProductPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrices()>o2.getPrices())
            return 1;
        else {
            if (o1.getPrices() == o2.getPrices())
                return 0;
            else
                return -1;
        }
    }
}
