package ClassWork4;

public class Main {
    public static void main(String[] args) {
        Task4 test = new Task4();
        test.push(5).push(7).push(5);
        System.out.println(test.size());
        test.pop();
        System.out.println(test.size());
        System.out.println(test.peek());
        System.out.println(test.empty());
        test.pop();
        test.pop();
        System.out.println(test.empty());
        test.pop();

    }
}
