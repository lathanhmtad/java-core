package exercise.basic.ex4;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        /*
        Question 13:
            String not contains digit
         Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
         Ví dụ:
              "abc" => true
              "1abc", "abc1", "123", "a1bc", null => false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        boolean isDigit = false;
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isDigit(c)) {
                isDigit = true;
                break;
            }
        }
        System.out.printf("%s có chứa chữ số: %s", input, isDigit);
    }
}
