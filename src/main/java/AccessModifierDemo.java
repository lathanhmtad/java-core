import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // Phạm vi truy cập

        // public: Mọi nơi
        Dog dog1 = new Dog("Long", 2);
        System.out.println("dog1.name = " + dog1.name);
        // System.out.println("dog1.age = " + dog1.age);

        // protected: Cùng package hoặc class con
        Dog dog2 = new Dog("Long", 2);
        // System.out.println("dog2.age = " + dog2.age);

        // default: Cùng package
        Dog dog3 = new Dog("HI", 20);
        // System.out.println("dog3.color = " + dog3.color);

        // private: Cùng class
        Dog dog4 = new Dog("J");
//        System.out.println("dog4.name = " + dog4.id);
    }
}
