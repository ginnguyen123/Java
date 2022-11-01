package services;
import model.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class ProductServices {
    private static ArrayList<Product> products; // lưu trữ data thông tin của object product bằng arraylist
//    public static ProductServices()
//    {
//        init();
//    }
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
    public ArrayList<Product> getProducts(){
        return this.products;
    }
    public void setProducts (ArrayList<Product> products) {
        this.products = products;
    }
}
