import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        float weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng:");
        weight = scanner.nextFloat();
        System.out.println("Nhập chiều cao:");
        height = scanner.nextFloat();
        float bmi = weight/(height*height);
        if(bmi<18){
            System.out.printf("BMI: %.2f - Underweight", bmi);
        } else if (bmi < 25.0) {
            System.out.printf("BMI: %.2f - Normal", bmi);
        } else if (bmi < 30.0) {
            System.out.printf("BMI: %.2f - Overweight", bmi);
        } else {
            System.out.printf("BMI: %.2f - Obese", bmi);
        }
    }
}
