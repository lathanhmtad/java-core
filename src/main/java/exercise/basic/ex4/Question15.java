package exercise.basic.ex4;

public class Question15 {
    public static void main(String[] args) {
        /*
        Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
        Ví dụ: " I am developer " => "developer am I".
        Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
        Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách
         */
        Exercise4 exercise4 = new Exercise4();
        System.out.println(exercise4.question15(" I am developer "));
        System.out.println(exercise4.question15("  nguyen    dang duy"));
    }
}
