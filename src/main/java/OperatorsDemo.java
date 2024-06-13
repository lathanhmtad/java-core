public class OperatorsDemo {
    public static void main(String[] args) {
        // Toán tử số học
        // +, -, *, /, %
        // int +-*/% int -> int
        System.out.println(99 + 1);
        System.out.println(99 - 1);
        System.out.println(99 * 2);
        System.out.println(99 / 2);
        System.out.println(99 % 2);

        // +=, -=, *=, /=, %=
        int a = 100;
        a += 10;
        System.out.println("a = " + a);

        // ++, --
        int b = 1000;
        b++; // b += 1
        System.out.println("b = " + b);

        // Chú ý
        int c = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Toán tử quan hệ
        // ==, >, >=, <, <=, !=

        // Toán tử logic
        // ADN: &&
        // OR: ||
        // NOT: !
        boolean ok = b > 5 && b < 10;
        boolean notTrue = !true;
        boolean test = b > 5 || b < 10;
    }
}
