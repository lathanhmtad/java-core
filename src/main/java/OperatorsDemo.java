public class OperatorsDemo {
    public static void main(String[] args) {


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
    }
}
