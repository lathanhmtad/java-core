package exercise.basic.ex4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
        Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
        VD:
        Người dùng nhập vào "Nam", hệ thống sẽ in ra
        "Ký tự thứ 1 là: N"
        "Ký tự thứ 1 là: A"
        "Ký tự thứ 1 là: M"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            System.out.printf("Ký tự thứ %d là: %c%n", i + 1, name.charAt(i));
        }
    }
}
