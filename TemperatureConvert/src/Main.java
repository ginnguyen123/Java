import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;
        int choice;
        do {
            System.out.println("Chọn chương trình chuyển đổi!");
            System.out.println("1.Độ C sang độ F!");
            System.out.println("2.Độ F sang độ C!");
            System.out.println("0.Thoát!");
            System.out.print("Nhập chương trình: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Nhập giá trị độ C: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("Độ C %0.2d tương ứng độ F: %0.2d",celsius,fahrenheit);
                    break;
                case 2:
                    System.out.print("Nhập giá trị độ F: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.printf("Độ F %0.2d tương ứng độ C: %0.2d",fahrenheit,celsius);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhập số đúng với chương trình!");
                    break;
            }

        }while (choice !=0);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return  fahrenheit;
    }
}