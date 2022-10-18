import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = inputElementToArray();
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.printf("Giá trị nhỏ nhất trong mảng: %d", min);
    }
    public static int[] inputElementToArray(){
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int size = scanner.nextInt();
        int [] arr = new int [size];
        for (int i=0; i<= arr.length - 1 ; i++){
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            int temp = scanner.nextInt();
            arr[i] = temp;
        }
        return arr;
    }
}