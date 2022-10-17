import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0; // đếm số lượng số nguyên tố tìm thấy
        int scanNum = 2;
        String str = "";
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
                while (count<num){
                    boolean flag = true;
                    for(int i=2; i<scanNum ; i++){
                        if(scanNum % i == 0){
                            flag = false;
                            break;
                        }
                    }
                    if (flag){
                        count++;
                        str+= scanNum + " ";
                    }
                    scanNum++;
                }
                checkNum = false;
            }
        } while(checkNum);
        System.out.print(str);
    }
}