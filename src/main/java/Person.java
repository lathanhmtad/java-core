public class Person {
    int id;
    String name;
    int age;

    public Person(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    int age() {
        return 5;
    }
}
