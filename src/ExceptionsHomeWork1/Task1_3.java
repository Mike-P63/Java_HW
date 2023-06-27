package ExceptionsHomeWork1;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        return a / b; //ArithmeticException: / by zero
    }
}
