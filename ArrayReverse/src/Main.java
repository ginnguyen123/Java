import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size>=10){
                System.out.println("Nhập số lượng phần tử trong mảng bé hơn 10!");
            }
        }while (size>9);
        arr = new int[size];
        int i = 0;
        while (i< arr.length){
            System.out.print("Nhập phần tử "+(i+1)+": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-10s%s", "Mảng: ", "");
        System.out.print("[");
        for (int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+",");
            if (j == arr.length - 1){
                System.out.print(arr[j]+"]");
            }
        }
        for (int j = 0;j< arr.length/2; j++){
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 -j] = temp;
        }
        System.out.println("");
        System.out.printf("%-10s%s", "Mảng sau khi đảo mảng: ", "");
        System.out.print("[");
        for (int j = 0; j< arr.length; j++){
            System.out.print(arr[j]+",");
            if (j == arr.length - 1){
                System.out.print(arr[j]+"]");
            }
        }
    }
}