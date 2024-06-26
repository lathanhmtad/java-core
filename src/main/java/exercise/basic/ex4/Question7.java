package exercise.basic.ex4;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        /*
        Question 7:
        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
        a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn   nam"
        b) Viết hoa chữ cái mỗi từ của người dùng
        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên: ");
        String fullName = scanner.nextLine();
        String[] words = fullName.split(" ");
        String standardizeFullName = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                standardizeFullName = standardizeFullName.concat(word + " ");
            }
        }
        standardizeFullName = standardizeFullName.substring(0, standardizeFullName.length() - 1);
        System.out.printf("%s được chuẩn hóa %s", fullName, standardizeFullName);
    }
}
