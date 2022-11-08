import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main  (String[] args) {
            System.out.println("Nhập cạnh a: ");
            float a = scanner.nextFloat();
            System.out.println("Nhập cạnh b: ");
            float b = scanner.nextFloat();
            System.out.println("Nhập cạnh c: ");
            float c = scanner.nextFloat();
            if (a <= 0 || b <= 0 || c <= 0)
                throw new IllegalTriangleException("Cạnh lớn hơn 0");
            else if ((a+b) <=c || (a+c) <= b || (b+c) <= a)
                throw new IllegalTriangleException
    }
}