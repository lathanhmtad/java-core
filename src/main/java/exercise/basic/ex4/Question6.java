package exercise.basic.ex4;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*
        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy
        đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
        VD:
        Người dùng nhập vào "Nguyễn Văn Nam"
        Hệ thống sẽ in ra
        "Họ là: Nguyễn"
        "Tên đệm là: Văn"
        "Tên là: Nam"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên: ");
        String fullName = scanner.nextLine().trim();

        int firstSpaceIndex = fullName.indexOf(' ');
        int lastSpaceIndex = fullName.lastIndexOf(' ');

        String surname = fullName.substring(0, firstSpaceIndex);
        String middleName = fullName.substring(firstSpaceIndex, lastSpaceIndex).trim();
        String lastName = fullName.substring(lastSpaceIndex).trim();
        System.out.printf("Họ là: %s%n", surname);
        System.out.printf("Tên đệm là: %s%n", middleName);
        System.out.printf("Tên là: %s", lastName);
    }
}
