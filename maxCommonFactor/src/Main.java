import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a:");
        a = scanner.nextInt();
        System.out.print("Nhập số b:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b ==0){
            System.out.println("a và b không có ước chung lớn nhất");
        }
        while (a!=b){
            if (a>b){
                a -=b;
            }else {
                b-=a;
            }
        }
        System.out.printf("Ước chung lớn nhất a và b: %d", a);
    }
}