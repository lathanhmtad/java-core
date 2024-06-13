public class StringDemo {
    public static void main(String[] args) {
        // Primitive: Nguyên thủy
        String s1 = "Java core";
        String s2 = "Java core";

        // Non primitive
        String s3 = new String("Java core");
        String s4 = new String("Java core");

        // So sánh == và equals (== so sánh địa chỉ, equals so sánh nội dung)
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s2 == s3 = " + (s2 == s3));
        System.out.println("s3 == s4 = " + (s3 == s4));

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
