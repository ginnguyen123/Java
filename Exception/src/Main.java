import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter: ");
        int x = scanner.nextInt();
        try{
            System.out.print("Nhập index trong mảng: " + x + " value: " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.print("IndexOutOfBoundsException");
        }
    }
    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}