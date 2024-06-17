package exercise.extra.ex2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*
        Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1.
        Hãy liệt kê các phần tử xuất hiện trong dãy đúng 2 lần.
         */

        // double[] numbers = {2.54, 1.91, 4.51, 9.5, 7.2, 2.54, 1.91, 3.11, 0.5, 2.54, 12.55, 9.5, 12.55};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài của mảng: ");
        int length = scanner.nextInt();
        double[] numbers = new double[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            numbers[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (double number : numbers) {
            System.out.printf("%f ", number);
        }


        System.out.print("\nCác phần tử xuất hiện đúng 2 lần: ");
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 < numbers.length && numbers[i] == numbers[i + 1]) {
                count++;
            } else {
                if (count == 2) {
                    System.out.printf("%f ", numbers[i - 1]);
                }
                count = 1;
            }
        }
    }
}
