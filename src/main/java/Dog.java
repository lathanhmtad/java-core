public class Dog {
    String name;
    int age;

    Dog(String name) {
        this.name = name;
    }

    Dog(String name, int age) {
        System.out.println("Khởi tạo 2 tham số");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
