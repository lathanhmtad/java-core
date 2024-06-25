package annotation;

import java.util.Arrays;

public class AnnotationDemo {
    public static void main(String[] args) {
        // Cú pháp: @ + Tên

        // @Override
        AnnotationDemo demo = new AnnotationDemo();
        System.out.println("demo = " + demo);

        Class<?> clazz = demo.getClass();

        // @Deprecated
        int max = MyMath.maxV1(4, 6);
        System.out.println("max = " + max);

        // @SuppressWarning
        @SuppressWarnings("deprecation")
        int m = MyMath.maxV1(1, 0);
        System.out.println("m = " + m);
    }

    @Override
    public String toString() {
        return "This is AnnotationDemo class";
    }
}
