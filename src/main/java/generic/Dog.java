package generic;

public class Dog<T extends Number> { // extend có thể là interface hoặc class
    private String name;
    private T age;

    public Dog(T age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
