public class WhileDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("--------------");
        int i2 = 1;
        while (i2 <= 10) {
            System.out.println("i2 = " + i2++);
        }
    }
}
