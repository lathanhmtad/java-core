package exercise.ex4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        /*
        Viết chương trình để người dùng nhập
        vào tên và kiểm tra, nếu tên chữ viết hoa chữ cái đầu thì viết hoa lên.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên của bạn: ");
        String name = scanner.nextLine(); // duy
        String capitalizedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("capitalizedName = " + capitalizedName);
    }
}
