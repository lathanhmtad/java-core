package exercise.basic.ex4;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        /*
        Question 14: Replace character
        Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
        Ví dụ:
        "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
         */
        String s = "VTI Academy";
        char from = 'e';
        char to = '*';

        String result = "";

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == from) result = result.concat(String.valueOf(to));
            else result = result.concat(String.valueOf(c));
        }

        System.out.println(result);
    }
}
