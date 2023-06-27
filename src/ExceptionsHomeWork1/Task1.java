package ExceptionsHomeWork1;

public class Task1 {
    public static void main(String[] args) {
    System.out.println(divide(100, 0));
}

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("На ноль делить нельзя!");
        }
        return a / b; // На ноль делить нельзя!
    }
}

