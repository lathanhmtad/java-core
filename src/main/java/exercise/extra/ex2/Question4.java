package exercise.extra.ex2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
        Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
        Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số nguyên: ");
        int x = scanner.nextInt();
        int sumDigits = 0;
        int xCopy = x;
        while (x != 0) {
            sumDigits += x % 10;
            x /= 10;
        }
        System.out.printf("Tổng các chữ số của %d = %d", xCopy, sumDigits);
    }
}
