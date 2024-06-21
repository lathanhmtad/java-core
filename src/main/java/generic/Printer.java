package generic;

public class Printer {
    public static <T> void printAny(T o) {
        System.out.println(o);
    }
}
