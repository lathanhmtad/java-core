public class ClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Shiba";
        dog.age = 3;
        dog.bark();

        Dog dog2 = new Dog();
        System.out.println("dog2.name = " + dog2.name);

        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);

        int sum = dog.sum(7, 8);
        System.out.println("sum = " + sum);
    }
}