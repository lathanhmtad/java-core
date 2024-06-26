package exercise.basic.ex4;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        /*
        Question 16:
        Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần bằng nhau với n ký tự.
        Nếu chuỗi không chia được thì xuất ra màn hình “KO”.
        */
        String input = "nguyenthoquangvinh";
        int n = 3;

        Exercise4 exercise4 = new Exercise4();
        System.out.println(exercise4.question16(input, n));
    }
}
