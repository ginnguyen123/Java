import java.util.Scanner;

public class BubbleSortByStep {
    public static Scanner scanner;
    public static void main(String[] args) {
//        System.out.println("size: ");
//        int size = scanner.nextInt();
        int[] list = {4,6,8,2,1,5,7,8};
        int min = list[0];
        for (int i = 0; i< list.length; i++){
            for (int j = list.length - 1; j > i; j--){
                if (list[j] < list[j-1]){
                    int temp;
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
        for (int i : list){
            System.out.println(i);
        }
    }
}
