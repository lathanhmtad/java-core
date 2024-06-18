package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Tính kế thừa
        // Mục đích: Tái sử dụng code
        // Từ khóa: extends

        Duck duck = new Duck("Long", 4);
        // duck.name = "";

        // @Override
        duck.eat();

        // Từ khóa: super
        System.out.println(duck);

        // Đơn kế thừa
    }
}
