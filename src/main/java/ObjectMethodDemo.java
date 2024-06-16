public class ObjectMethodDemo {
    public static void main(String[] args) {
        // toString
        Dog dog = new Dog();
        dog.name = "Long";
        dog.age = 2;
        System.out.println("dog = " + dog);

        // equals
        Dog dog1 = new Dog();
        dog1.name = "Long";
        dog1.age = 20;

        Dog dog2 = new Dog();
        dog2.name = "Long";
        dog2.age = 20;

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());

        // hashCode
        // 2 đối tượng bằng nhau thì hashCode bằng nhau
        // hashCode bằng nhau chưa chắc 2 đối tượng bằng nhau cần phải so sánh các thuộc tính
    }
}
