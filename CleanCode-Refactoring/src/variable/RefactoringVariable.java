package variable;
public class RefactoringVariable {
    public static String fizzBuzz(int number){
        int isFizz = number % 3;
        int isBuzz = number % 5;
        if(isFizz == 0 && isBuzz == 0)
            return "FizzBuzz";

        if(isFizz == 0)
            return "Fizz";

        if(isBuzz == 0)
            return "Buzz";

        return number + "";
    }
}
