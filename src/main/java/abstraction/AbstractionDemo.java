package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng
        // Abstract class
        // Trừu tượng không hoàn toàn (< 100%)
        // Không thể khởi tạo
        // Shape shape = new Shape(); Lỗi
        Circle circle = new Circle(1);
        System.out.println("circle.area() = " + circle.area());


        // Interface
        // Trừu tượng hoàn toàn (100%)
        // Mặc định: public abstract
        // Đa kế thừa
    }
}
