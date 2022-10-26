package Refactoring;

public class CalculatorTest {

    void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
    }
    void testCalculateSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = Calculator.calculate(a, b, o);
    }
    void testCalculateMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a, b, o);
    }
    void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
    }

    void testCalculateDivByZero() {
        int a = 2;
        int b = 0;
        char o = '/';
    }

    void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = '=';

    }
}
