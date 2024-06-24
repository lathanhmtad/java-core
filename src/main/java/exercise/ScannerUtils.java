package exercise;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                String input = sc.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.out.println("Nhập lại: ");
            }
        }
    }

    public static int inputPositiveInt() {
        while (true) {
            try {
                String input = sc.nextLine();
                int n = Integer.parseInt(input);
                if (n > 0)
                    return n;
                else {
                    System.err.println("Yêu cầu nhập vào số nguyên dương: ");
                    System.out.println("Nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu nhập vào số nguyên dương: ");
                System.out.println("Nhập lại: ");
            }
        }
    }

    public static float inputFloat() {
        while (true) {
            try {
                String input = sc.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu nhập vào số thực: ");
                System.out.println("Nhập lại: ");
            }
        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                String input = sc.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu nhập vào số thực: ");
                System.out.println("Nhập lại: ");
            }
        }
    }

    public static String inputString() {
        return sc.nextLine();
    }

    public static String inputEmail() {
        // Yêu cầu chứa @
        while (true) {
            String input = sc.nextLine();
            if (input.contains("@")) return input;
            else {
                System.err.println("Yêu cầu email chứa kí tự @.");
                System.out.println("Nhập lại: ");
            }
        }
    }

    public static String inputPassword() {
        // Yêu cầu từ 6-12 kí tự, ít nhất 1 kí tự viết hoa
        while (true) {
            String input = sc.nextLine();
            int length = input.length();
            if (length < 6 || length > 12) {
                System.err.println("Yêu cầu pass từ 6 đến 12 kí tự.");
                System.out.println("Nhập lại: ");
            } else {
                for (int i = 0; i < length; i++) {
                    char c = input.charAt(i);
                    if (Character.isUpperCase(c)) return input;
                }
                System.err.println("Yêu cầu password ít nhất 1 kí tự viết hoa.");
                System.out.println("Nhập lại: ");
            }
        }
    }

    public static String inputFullName() {
        // Yêu cầu chỉ chứa chữ cái (không ký tự đặc biệt, không số)
        while (true) {
            String input = sc.nextLine();
            if(hasAllAlphabetic(input))
                return input;
            System.err.println("Yêu cầu full name chỉ chứa chữ cái.");
            System.out.println("Nhập lại: ");
        }
    }

    private static boolean hasAllAlphabetic(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) continue;
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }
}
