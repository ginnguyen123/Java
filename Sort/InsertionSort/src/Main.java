public class Main {
    public static void main(String[] args) {
        int max;
        int index;
        int[] list = {1,2,64,63,743,71,3,6,2,754};
        for (int i = 1; i< list.length; i++){
            max = list[i];
            index = i;
            while (index>0 && max<list[index-1]){
                list[i] =list[index -1];
                index--;
            }
            list[index] = max;
        }
        for (int i : list){
            System.out.print(i+",");
        }
    }
}