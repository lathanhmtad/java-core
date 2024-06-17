package exercise.extra.ex1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        /*
        Viết chương trình nhập vào 4 số nguyên.
        Hiển thị ra số lớn nhất và nhỏ nhất
        Ví dụ:
        Nhập vào 4 số 1,2,3,4 thì kết quả là:
        Số lớn nhất là: 4
        Số nhỏ nhất là: 1
         */
        Scanner scanner = new Scanner(System.in);
        int length = 4;
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Nhập phần tử tại %d: %n", i + 1);
            nums[i] = scanner.nextInt();
        }

        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.printf("Số lớn nhất là: %d %n", max);
        System.out.printf("Số nhỏ nhất là: %d %n", min);
    }
}
