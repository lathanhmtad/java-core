package exercise.extra.ex1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
        Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet (cm).
        Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân)
        và inch (số thực, có 2 số lẻ thập phân).
        Với 1 inch = 2.54 cm và 1 foot = 12 inches.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thực: ");
        double x = scanner.nextDouble();
        double xInch = x / 2.54;
        double xFoot = xInch / 12;
        System.out.printf("%f cm = %.2f inch %n", x, xInch);
        System.out.printf("%f cm = %.2f foot %n", x, xFoot);
    }
}
