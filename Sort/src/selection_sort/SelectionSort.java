package selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {1,4,5,1,534,643,743,765,9,876};
        for (int i = 0; i<list.length - 1;i++){
            int max = i;
            for (int j=i+1; j<list.length;j++){
                if (list[max]<list[j]){
                    j = max;
                }
            }
            if (max!=i){
                int temp;
                temp = list[i];
                list[i] = list[max];
                list[max] = temp;
            }
        }
        for (int i : list){
            System.out.print(i);
        }
    }
}
