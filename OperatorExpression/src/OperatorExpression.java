import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width, height;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng hình chữ nhật:");
        width = scanner.nextFloat();
        System.out.print("Nhập chiều dài hình chữ nhật:");
        height = scanner.nextFloat();
        area = width * height;
        System.out.println("Diện tích: "+area);

    }
}
