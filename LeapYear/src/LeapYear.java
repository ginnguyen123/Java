import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
    int year;
    boolean isLeapYear = false;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập số năm cần kiểm tra năm nhuận: ");
    year = scanner.nextInt();
    if(year % 4 == 0){
        if(year % 100==0){
            if (year % 400 == 0){
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
        } else {
            isLeapYear = true;
        }
    }
    if (isLeapYear) {
        System.out.println(year + " là năm nhuận");
    } else {
        System.out.println(year+ " không là năm nhuận");
    }
    }
}

