package exercise.ex2.q1;

/*
Question 1: final variable
Tạo class MyMath, khai báo final variable số PI = 3.14
Viết method sum(int a) và trả về tổng của a và PI
Thử thay đổi số PI = 3.15 trong method xem có được ko?
 */
public class MyMath {
    public final double PI = 3.14;

    public double sum(int a) {
        // PI = 3.15 // Lỗi
        return a + PI;
    }
}
