package exercise.basic.ex4;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /*
        Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu
        người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ: ");
        String surname = scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.printf("Họ và tên đầy đủ: %s %s", surname, name);
    }
}
