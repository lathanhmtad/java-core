package exercise.ex2;

public class Question2 {
    public static void main(String[] args) {
        /*
        Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
        ra số nguyên đó thành định dạng như sau: 100,000,000
         */
        int x = 100000000;
        System.out.printf("%,d", x);
    }
}
