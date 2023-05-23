package ClassWork2;
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит
// из чередующихся символов c1 и c2, начиная с c1.


public class Task1 {
    private String one = "c1";
    private String two = "c2";

    public void build(int num) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                build.append("c1");
            } else {
                build.append("c2");
            }
        }
        System.out.println(build);
    }
}
