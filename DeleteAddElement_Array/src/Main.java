import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //int[] array = inputElementToArray();
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] newArr = addArray(arr1, arr2);
        System.out.print("[");
        for (int i=0;i<=newArr.length-1;i++){
            if (i == (newArr.length - 1)){
                System.out.print(newArr[i] + "]");
            }else {
                System.out.print(newArr[i] + ",");
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

    public static int[] deletaElementAtXLocation(int xIndex, int[] array){
        int[] newArray = Arrays.copyOf(array,array.length -1);
        if (xIndex<0 || xIndex>=array.length){
            System.out.println("Nhập sai giá trị index!");
        }else {
            for (int i = xIndex; i<newArray.length; i++){
                newArray[i] = array[i-1];
            }
        }
        return  newArray;
    }

    public static int[] addArray(int[] array1, int[] array2){
        int[] newArray = Arrays.copyOf(array1, (array1.length + array2.length));
        for (int i = array1.length; i < newArray.length; i++){
            newArray[i] = array2[i - array1.length];
        }
        return newArray;
    }
}
