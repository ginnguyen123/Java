import java.util.Scanner;

public abstract class Drawing {
    public static void main(String[] args) {
        int choice = -1;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn chọn hình muốn vẽ:");
        System.out.println("Hình chữ nhật - nhập số 1.");
        System.out.println("Bạn chọn hình tam giác vuông phải trên - nhập số 2.");
        System.out.println("Bạn chọn hình tam giác vuông trái trên - nhập số 3.");
        System.out.println("Bạn chọn hình tam giác vuông phải dưới - nhập số 4.");
        System.out.println("Bạn chọn hình tam giác vuông trái dưới - nhập số 5.");
        System.out.println("Bạn chọn hình tam giác cân - nhập số 6");
        System.out.println("Hủy - nhập số 0");
        System.out.print("Nhập số: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.print("Nhập chiều dài hình chữ nhật:");
                int width = scanner.nextInt();
                System.out.print("Nhập chiều rộng hình chữ nhật:");
                height = scanner.nextInt();
                printTheRectange(height,width);
                break;
            case 2:
                System.out.print("Nhập chiều cao tam giác vuông phải trên: ");
                height = scanner.nextInt();
                printTheSquareTriangleTopRight(height);
                break;
            case 3:
                System.out.print("Nhập chiều cao tam giác vuông trái trên: ");
                height = scanner.nextInt();
                printTheSquareTriangleTopLeft(height);
                break;
            case 4:
                System.out.print("Nhập chiều cao tam giác vuông phải dưới: ");
                height = scanner.nextInt();
                printTheSquareTriangleBottonRight(height);
                break;
            case 5:
                System.out.print("Nhập chiều cao tam giác vuông trái dưới: ");
                height = scanner.nextInt();
                printTheSquareTriangleBottonLeft(height);
                break;
            case 6:
                System.out.print("Nhập chiều cao tam cân: ");
                height = scanner.nextInt();
                printIsoscelesTriangle(height);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.print("Nhập sai! Hãy nhập đúng giá trị!");
        }
        //printTheRectange(3,10);
        //printTheSquareTriangleTopRight(5);
        //printTheSquareTriangleTopLeft(5);
        //printTheSquareTriangleBottonRight(5);
        //printTheSquareTriangleBottonLeft(5);
        //printIsoscelesTriangle(5);

    }

    public static void printTheRectange(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= width; j++) {
                if (j == width) {
                    System.out.println("");
                } else {
                    System.out.print("*");
                }
            }
        }
    }

    public static void printTheSquareTriangleTopLeft(int height) {
        if (height > 0) {
            for (int i = height; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Nhập chiều cao h>0");
        }
    }

    public static void printTheSquareTriangleTopRight(int height) {
        if (height > 0) {
            for (int i = height; i >= 1; i--) {
                for (int j = 1; j <= height; j++) {
                    if (j <= (height - i)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("Nhập chiều cao h > 0");
        }
    }

    public static void printTheSquareTriangleBottonRight(int height) {
        if (height > 0) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= height; j++) {
                    if (j <= height - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("Nhập chiều cao h > 0");
        }
    }

    public static void printTheSquareTriangleBottonLeft(int height) {
        if (height > 0) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Nhập chiều cao h > 0");
        }
    }

    public  static void printIsoscelesTriangle(int height) {
        if(height>0){
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= 2 * height; j++) {
                    if (Math.abs(height - j) <= (i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }else {
            System.out.println("Nhập chiều cao h > 0");
        }
    }
}

