package exercise.basic.ex4;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
            Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó
            (các từ có thể cách nhau bằng nhiều khoảng trắng );
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một xâu ký tự");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String i : words) {
            if (!i.isEmpty()) count++;
        }
        System.out.printf("%s có %d từ", s, count);
    }
}
