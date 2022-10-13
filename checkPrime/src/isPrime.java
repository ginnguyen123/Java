import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số cần kiểm tra có phải là số nguyên tố:");
        int num = scanner.nextInt();
        if(num<2){
            System.out.printf("%d không phải số nguyên tố", num);
        } else {
            int i = 2;
            boolean checkPrime = true;
            while (i <= Math.sqrt(num)){
                if(num%i==0){
                    checkPrime = false;
                    break;
                }
                i++;
            }
            if (checkPrime){
                System.out.printf("%d là số nguyên tố!", num);
            }else {
                System.out.printf("%d không phải là số nguyên tố!",num);
            }
        }
    }
}
