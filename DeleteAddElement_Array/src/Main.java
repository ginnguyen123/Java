import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //int[] array = inputElementToArray();
        int[] arr = {2,5,7,4,2,6,7,2,7};
        int[] newArr = addElementAtXLocation(8,333, arr);
        System.out.print("[");
        for (int i=0;i<=arr.length-1;i++){
            if (i == (arr.length - 1)){
                System.out.print(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ",");
            }
        }
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
    public static int[] addElementAtXLocation(int xIndex,int value, int[] array){
        int[] newArray = new int[array.length+1];
        if (xIndex<0 || xIndex>array.length){
            System.out.print("Nhâp sai vị trí cần chèn trong mảng!");
        }else {
            for (int i = 0; i <= newArray.length - 1; i++) {
                if (i < xIndex) {
                    newArray[i] = array[i];
                }if (i == xIndex) {
                    newArray[i] = value;
                }
                if (i>xIndex){
                    newArray[i] = array[i-1];
                }
            }
        }
        return newArray;
    }


}
