package ExceptionsHomeWork1;

public class Task1_2 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b; // -1
    }
}

