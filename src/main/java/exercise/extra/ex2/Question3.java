package exercise.extra.ex2;

import java.util.HashMap;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        /*
        Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
        In ra màn hình số lần xuất hiện của các phần tử.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int length = scanner.nextInt();
        double[] numbers = new double[length];
        // double[] numbers = {1, 4, 1, 5, 6, 7, 3, 4, 3, 3, 5,7, 6};

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

        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 != numbers.length && numbers[i] == numbers[i + 1]) {
                count++;
            } else {
                System.out.printf("%n%f xuất hiện %d lần", numbers[i], count);
                count = 1;
            }
        }

    }
}
