package innerclass;

public class Outer {
    private int value;

    public Outer(int value) {
        this.value = value;
    }

    public class Inner {
        public void showInfo() {
            System.out.println("outer value = " + value);
        }
    }
}
