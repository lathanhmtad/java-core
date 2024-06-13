public class DataTypeCastingDemo {
    public static void main(String[] args) {
        // Widening: mở rộng
        // byte -> short -> int -> long -> float -> double
        byte a = 10;
        int b = (int) a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Narrowing : Thu hẹp
        // double -> float -> long -> int -> short -> byte
        long m = 8000000000L;
        int n = (int) m;
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        short u = 789;
        byte v = (byte) u;
        System.out.println("v = " + v);

        // Chú ý
        int x = 1;
        int y = 2;
        System.out.println("x / y = " + (float) x / y);
        System.out.println("x / y = " + x / (float) y);
        System.out.println("x / y = " + (float) x / (float) y);
        System.out.println("x / y = " + (float) (x / y));

        // char: 0 -> 255
        char c = 0;
        System.out.println("c = " + c);
    }
}
