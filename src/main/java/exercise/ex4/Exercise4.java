package exercise.ex4;

public class Exercise4 {
    /*
    Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
    Nếu có xuất ra “OK” ngược lại “KO”.
    Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
    */
    String question10(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();

        if (length1 != length2) return "KO";

        int length = length1 % 2 == 0 ? length1 / 2 : length1 / 2 + 1;

        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(length2 - i - 1))
                return "KO";
        }
        return "OK";
    }

    /*
    Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
    Ví dụ: " I am developer " => "developer am I".
    Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
    Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách
     */
    String question15(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        String res = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty())
                res = res + words[i] + " ";
        }
        return res.substring(0, res.length() - 1);
    }
}
