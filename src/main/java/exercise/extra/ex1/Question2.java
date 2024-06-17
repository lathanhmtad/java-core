package exercise.extra.ex1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*
        Viết chương trình nhập vào số giây từ 0 tới 68399,
        đổi số giây này thành dạng [giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.
        Ví dụ: 02:11:05
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số giây: ");
        int totalSeconds = scanner.nextInt();
        int hour = totalSeconds / 3600;
        int minute = totalSeconds % 3600 / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%d giây = %02d:%02d:%02d", totalSeconds, hour, minute, seconds);

    }
}
