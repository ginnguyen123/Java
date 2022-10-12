import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int usd, vnd;
        int rate;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số tiền USD:");
        usd = scanner.nextInt();
        System.out.println("Nhập tỉ giá hiện tại:");
        rate = scanner.nextInt();
        vnd = usd*rate;
        System.out.printf("Số tiền: %d VNĐ",vnd);
    }
}