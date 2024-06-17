package exercise.extra.ex1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
        Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó.
        Nếu hiệu số lớn hơn 0 thì in ra dòng chữ [Số thứ nhất lớn hơn số thứ hai].
        Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất nhỏ hơn số thứ hai].
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        int c = a - b;
        if (c > 0)
            System.out.println("Số thứ nhất lớn hơn số thứ hai");
        if (c < 0)
            System.out.println("Số thứ nhất nhỏ hơn số thứ hai");
    }
}
