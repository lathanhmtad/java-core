package exercise.basic.ex4;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        /*
        Question 12: Reverse String
        Đảo ngược chuỗi sử dụng vòng lặp
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s = scanner.nextLine();

        String sReverse = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            sReverse = sReverse.concat(String.valueOf(s.charAt(i)));
        }
        System.out.printf("Chuỗi đảo ngược của chuỗi %s là %s", s, sReverse);
    }
}
