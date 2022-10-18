import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = inputTwoDimensionalArr(3,3);
        int max = arr[0][0];
        System.out.print(printTwoDimensionalArr(arr));
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j<arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Giá trị lớn nhất trong mảng: %d",max);
    }
    public static int[][] inputTwoDimensionalArr(int rows, int colums){
        int[][] arr = new int[rows][colums];
        for (int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.printf("Nhập phần tử vào mảng 2 chiều dòng %d, cột %d :",i,j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
    public static String printTwoDimensionalArr(int[][] array){
        String str = "";
        for (int i = 0; i< array.length; i++){
            str+= "[";
            for (int j = 0; j< array[i].length; j++){
                if(j == array[i].length - 1){
                    str+= array[i][j] + "]\n";
                }else {
                    str+= array[i][j] + ",";
                }
            }
        }
        return str;
    }
}