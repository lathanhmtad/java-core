package exercise.extra.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
        Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
        Hãy liệt kê các phần tử xuất hiện trong dãy đúng một lần
        */

        // double[] numbers = {2.54, 1.91, 4.51, 9.5, 7.2, 2.54, 1.91, 3.11, 2.54, 12.55, 9.5};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài của mảng: ");
        int length = scanner.nextInt();
        double[] numbers = new double[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            numbers[i] = scanner.nextDouble();
        }


        System.out.print("\nCác phần tử xuất hiện đúng 1 lần: ");
        for (double a : numbers) {
            int count = 0;
            for (double b : numbers) {
                if (a == b) count++;
                if (count >= 2) break;
            }
            if (count == 1)
                System.out.printf("%f ", a);
        }

    }
}
