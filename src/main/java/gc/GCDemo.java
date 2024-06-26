package gc;

public class GCDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Long");
        Dog dog2 = new Dog("Linh");
        dog2 = null;

        String s1 = "Duy";
        String s2 = "Duy";
        System.out.println(s1 == s2);

        System.gc();

        demo();
        System.gc();
    }

    public static void demo() {
        Dog dog = new Dog("ABC");
    }
}
