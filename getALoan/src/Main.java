import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float moneyDeposits;
        int month;
        float totalMoney = 0;
        float totalInterest = 0;
        float interestRate;
        System.out.print("Nhập số tiền gửi: ");
        moneyDeposits = scanner.nextFloat();
        System.out.print("Nhập số tháng gửi: ");
        month = scanner.nextInt();
        System.out.print("Nhập lãi suất(%/năm): ");
        interestRate = scanner.nextFloat();
        totalInterest += moneyDeposits*(interestRate/100)/12*month;
        totalMoney = totalInterest + moneyDeposits;
        System.out.printf("Tiền lãi: %.2f\n",totalInterest);
        System.out.printf("Tổng tiền lãi và tiền gửi: %.2f", totalMoney);
    }
}