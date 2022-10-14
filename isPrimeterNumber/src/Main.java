import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0; // đếm số lượng số nguyên tố tìm thấy
        int scanNum = 3;
        String str = "2";
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean checkNum = true;
        do {
            System.out.print("Nhập số lượng số nguyên tố cần hiển thị: ");
            num = scanner.nextInt();
            if (num<=0){
                System.out.println("\nNhập số lượng lớn hơn 0!");
                checkNum = true;
            } else {
                while (count<num-1){
                    for (int i = 2; i<scanNum;i++){
                        if (scanNum%i==0){
                            scanNum++;
                            break;
                        }else {
                            count++;
                            str+= " " + scanNum;
                            scanNum++;
                            break;
                        }
                    }
                }
                checkNum = false;
            }
        } while(checkNum);
        System.out.print(str);
    }
}