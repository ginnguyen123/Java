public class Main {
    public static void main(String[] args) {
        String str = "";
        boolean flag = true;
        for (int i = 2; i<100;i++){
            for (int j = 2; j < i; j++){
                if (i%j==0){
                    flag = false;
                    break;
                }else {
                    flag = true;
                }
            }
            if (flag){
                str+= i + " ";
            }
        }
        System.out.print(str);
    }
}