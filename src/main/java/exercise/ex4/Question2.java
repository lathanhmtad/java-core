package exercise.ex4;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi s1: ");
        String s1 = scanner.nextLine();

        System.out.println("Nhập chuỗi s2: ");
        String s2 = scanner.nextLine();

        System.out.println("s1 + s2 = " + s1.concat(s2));
    }
}
