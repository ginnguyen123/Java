package views.product;

import services.ProductServices;

public class EditProductView extends ProductViewTemplate{
    public EditProductView(){}

    @Override
    public void showBody() {
        //boolean flag = true
        System.out.println("> Edit product.");
        System.out.print("Enter ID product: ");
        long idProduct = Long.parseLong(scanner.nextLine());
        if (ProductServices.isFindID(idProduct)){
            System.out.println("1.Product name.");
            System.out.println("2.Product quantitys.");
            System.out.println("3.Product price.");
            System.out.println("3.Made in.");
            System.out.println("4.Design by.");
            System.out.println("0.Exit.");
            System.out.print(">Choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print(">Product name: ");
                    String nameProduct = scanner.nextLine();
                    ProductServices.findID(idProduct).setName(nameProduct);
                    break;
                case 2:
                    System.out.print(">Product quantitys: ");
                    int quantityProduct = scanner.nextInt();
                    ProductServices.findID(idProduct).setQuantitys(quantityProduct);
                    break;
                case 3:
                    System.out.println("Made in: ");
                    String madeIn = scanner.nextLine();
                    ProductServices.findID(idProduct).setMadeIn(madeIn);
                    break;
                case 4:
                    System.out.print("Design by: ");
                    String designBy = scanner.nextLine();
                    ProductServices.findID(idProduct).setDesinBy(designBy);
                    break;

            }
        }else
            System.out.println("ID product " + idProduct + "don't exist!");
    }
}
