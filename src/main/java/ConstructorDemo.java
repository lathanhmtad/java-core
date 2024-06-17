import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // 1. Tên constructor trùng với tên của class
        // 2. Constructor không có kiểu trả về
        Dog dog = new Dog("Long", 19);
        System.out.println("dog.toString() = " + dog.toString());

        Dog dog2 = new Dog("Duy");
        System.out.println("dog2.toString() = " + dog2.toString());

        // Mặc định: 0 tham số
        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);
    }
}
