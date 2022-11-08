package services;

import model.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ProductServices {
    private static ArrayList<Product> products; // lưu trữ data thông tin của object product bằng arraylist
    static {
        //khởi tạo danh sách sản phẩm ban đầu
        products = new ArrayList<>();
        Date creatDay = new Date();
        Instant createdUpdate = Instant.now();
        //Product(long id, String name, int quantitys, float prices, Date dateCreated,
        //                   Date dateUpdated, String madeIn, String desinBy)
        products.add(new Product(1L,"20W USB-C power adapter", 1,
                490000,creatDay,createdUpdate, "China", "Apple"));
        products.add(new Product(2L,"AirPods 2", 4,
                2890000,creatDay,createdUpdate, "China", "Apple"));
        products.add(new Product(3L,"Apple Watch SE", 2,
                6700000,creatDay,createdUpdate, "China", "Apple"));
        products.add(new Product(4L,"iPad Pro M1", 1,
                20000000,creatDay,createdUpdate, "China", "Apple"));
        products.add(new Product(5L,"Magic Mouse 2", 1,
                1800000,creatDay,createdUpdate, "China", "Apple"));
    }
    public static ArrayList<Product> getProducts(){
        return products;
    }
    public static void setProducts (ArrayList<Product> products) {
        products = products;
    }
    public static void addProduct(Product product){
        products.add(product);
    }
    public static void removeProduct(Product product){
        products.remove(product);
    }
    public static boolean isFindID(long idProduct){
        for (Product p : products){
            if (p.getId() == idProduct)
                return true;
        }
        return false;
    }
    public static Product findID(long idProduct){
        for (Product p : products){
            if (p.getId() == idProduct)
                return p;
        }
        return null;
    }
    public static boolean isFindProductName(String productName){
        for (Product p : products){
            if (p.getName().toLowerCase().contains(productName.toLowerCase()))
                return true;
        }
        return false;
    }
    public static Product findProductName(String productName){
        for (Product p : products){
            if (p.getName().toLowerCase().contains(productName.toLowerCase()))
                return p;
        }
        return null;
    }
    public static List<Product> findPrices(float price){
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : products){
            if (p.getPrices() == price || Math.abs(p.getPrices() - price) == 10000 ){
                //tìm giá đúng hoặc chênh lệch 10K - trả về mảng ds p
                result.add(p);
            }
        }
        return result;
    }
    public void sortByProductName(Comparator<Product> comparatorProductName){
        products.sort(comparatorProductName);
    }
    public void sortByProductPrice(Comparator<Product> comparatorProductPrice){
        products.sort(comparatorProductPrice);
    }
}
