package inheritance;

public class Animal {
    protected String name;
    protected int age;

    Animal() {
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void eat2() {
        System.out.println("Animal is eating...");
    }
}
