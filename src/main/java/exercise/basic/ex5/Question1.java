package exercise.basic.ex5;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
           Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.
         */

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
