public class StaticDemo {
    public static void main(String[] args) {
        // static property
        try {
            Student s1 = new Student("Long");
            System.out.println("Số lượng học sinh: " + Student.getCount());
            Student s2 = new Student("Quân");
            System.out.println("Số lượng học sinh: " + Student.getCount());
            Student s3 = new Student("Linh");
            System.out.println("Số lượng học sinh: " + Student.getCount());
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Số lượng học sinh: " + Student.getCount());
        }

        // static method
        int max = MyMath.max(100, 1);
        System.out.println("max = " + max);
    }
}
