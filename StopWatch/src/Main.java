import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    int[] arr = inputArray();
    StopWatch ping = new StopWatch();
    ping.start();
    sortArray(arr);
    ping.stop();
    System.out.println("Time: " + ping.getElapsedTime());
    }
    public static int[] inputArray(){
        System.out.println("Nhập số lương phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] = (int) (Math.random() * (100 - 10)) + 10;
        }
        return arr;
    }
    public static void sortArray(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.printf("a[%d] arr[%d][%d]: %d\n", i,  i,j,array[j]);
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}