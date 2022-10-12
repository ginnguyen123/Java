import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi (0 -999): ");
        num = scanner.nextInt();//000 - 999;
        int hundreds = num / 100;
        int dozen = (num % 100) / 10;
        int units = (num % 100) % 10;
        //System.out.printf("trăm: %d - chục: %d - đơn vị: %d", hundreds,dozen,units);
        String toHundredsByWord = "";
        String toDozenByWord = "";
        String toUnitsByWord = "";
        if (num<10){
            switch (units){
                case 0:
                    System.out.printf("Zero");
                    break;
                case 1:
                    System.out.printf("One");
                    break;
                case 2:
                    System.out.printf("Two");
                    break;
                case 3:
                    System.out.printf("Three");
                    break;
                case 4:
                    System.out.printf("Four");
                    break;
                case 5:
                    System.out.printf("Five");
                    break;
                case 6:
                    System.out.printf("Six");
                    break;
                case 7:
                    System.out.printf("Seven");
                    break;
                case 8:
                    System.out.printf("Eight");
                    break;
                case 9:
                    System.out.printf("Nine");
                    break;
            }

        } else if (num>=10 && num <20) {
            switch (units){
                case 0:
                    System.out.printf("Ten");
                    break;
                case 1:
                    System.out.printf("Eleven");
                    break;
                case 2:
                    System.out.printf("Twelve");
                    break;
                case 3:
                    System.out.printf("Thirteen");
                    break;
                case 4:
                    System.out.printf("Fourteen");
                    break;
                case 5:
                    System.out.printf("Fiveteen");
                    break;
                case 6:
                    System.out.printf("Sixteen");
                    break;
                case 7:
                    System.out.printf("Seventeen");
                    break;
                case 8:
                    System.out.printf("Eighteen");
                    break;
                case 9:
                    System.out.printf("Nineteen");
                    break;
            }

        } else if (num>=20 && num < 1000) {
            switch (dozen){
                case 2:
                    toDozenByWord = "Twenty";
                    break;
                case 3:
                    toDozenByWord = "Thirty";
                    break;
                case 4:
                    toDozenByWord = "Fourty";
                    break;
                case 5:
                    toDozenByWord = "Fifty";
                    break;
                case 6:
                    toDozenByWord = "Sixty";
                    break;
                case 7:
                    toDozenByWord = "Seventy";
                    break;
                case 8:
                    toDozenByWord = "Eighty";
                    break;
                case 9:
                    toDozenByWord = "Ninety";
                    break;
            }
            switch (units){
                case 0:
                    toUnitsByWord = "";
                    break;
                case 1:
                    toUnitsByWord = "One";
                    break;
                case 2:
                    toUnitsByWord = "Two";
                    break;
                case 3:
                    toUnitsByWord = "Three";
                    break;
                case 4:
                    toUnitsByWord = "Four";
                    break;
                case 5:
                    toUnitsByWord = "Five";
                    break;
                case 6:
                    toUnitsByWord = "Six";
                    break;
                case 7:
                    toUnitsByWord = "Seven";
                    break;
                case 8:
                    toUnitsByWord = "Eight";
                    break;
                case 9:
                    toUnitsByWord = "Nine";
                    break;
            }
            switch (hundreds){
                case 1:
                    toHundredsByWord = "One hundred";
                    break;
                case 2:
                    toHundredsByWord = "Two hundred";
                    break;
                case 3:
                    toHundredsByWord = "Three hundred";
                    break;
                case 4:
                    toHundredsByWord = "Four hundred";
                    break;
                case 5:
                    toHundredsByWord = "Five hundred";
                    break;
                case 6:
                    toHundredsByWord = "Six hundred";
                    break;
                case 7:
                    toHundredsByWord = "Seven hundred";
                    break;
                case 8:
                    toHundredsByWord = "Eight hundred";
                    break;
                case 9:
                    toHundredsByWord = "Nine hundred";
                    break;
            }
            if (hundreds == 0) {
                System.out.printf("%s %s", toDozenByWord, toUnitsByWord);
            } else
                System.out.printf("%s and %s %s", toHundredsByWord, toDozenByWord,toUnitsByWord);
        } else {
            System.out.println("Giá trị nhập không hợp lệ!");
        }
    }
}