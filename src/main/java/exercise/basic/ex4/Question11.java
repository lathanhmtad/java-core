package exercise.basic.ex4;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        /*
            Question 11: Count special Character
            Tìm số lần xuất hiện ký tự "a" trong chuỗi
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập một chuỗi: ");
        String input = sc.nextLine();

        int count = 0;
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c == 'a') count++;
        }

        System.out.printf("Ký tự a xuất hiện trong chuỗi %s %d lần", input, count);

        sc.close();

    }
}
