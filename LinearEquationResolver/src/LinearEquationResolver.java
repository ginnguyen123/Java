import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        int a,b,c;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a,b,c cho phương trình bậc 1: aX + b = c");
        System.out.println("Nhập a:");
        a = scanner.nextInt();
        System.out.println("Nhập b:");
        b = scanner.nextInt();
        System.out.println("Nhập c:");
        c = scanner.nextInt();
        if(a!=0){
            x = (c-b)/a;
            System.out.println("Phương trình có nghiệm là x = " +x);
        } else {
            if (b == c){
                System.out.println("Phương trình có vô số nghiệm!");
            } else{
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }
}
