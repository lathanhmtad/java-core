public class FinalDemo {
    public static void main(String[] args) {
        // final variable
        final double pi = 3.14;
        // pi = 5; // Lỗi

        // final method: Không thể Override method có final method
        Dog dog = new Dog();
        dog.run();

        // final class: Không thể kế thừa một lớp có final class
        // Shiba shiba = new Shiba();
        // shiba.run();

        // constant
        System.out.println("Math.PI = " + Math.PI);
        // Math.PI = 2.15; Lỗi
    }
}
