public class ContinueDemo {
    public static void main(String[] args) {
        System.out.println(8 % 5);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
