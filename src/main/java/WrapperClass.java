public class WrapperClass {
    public static void main(String[] args) {
        // Primitive            Wrapper class
        // byte                     Byte
        // short                    Short
        // int                      Integer
        // long                     Long
        // float                    Float
        // double                   Double
        // char                     Character
        // boolean                  Boolean

        // Boxing: Primitive -> Wrapper class
        int a = 100;
        Integer integer = Integer.valueOf(a);
        System.out.println("integer = " + integer);

        // Unboxing: Wrapper class -> Primitive
        Integer x = Integer.valueOf(100);
        int y = x.intValue();
        System.out.println("y = " + y);

        // Ứng dụng
        // 1. Kiểm tra kí tự in hoa, in thường, ...
        System.out.println("Character.isDigit('1') = " + Character.isDigit('1'));
        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('a'));

        // 2. Chuyển String sang số
        String s = "123456";
        int n = Integer.parseInt(s);
        System.out.println(s + 10);
        System.out.println("n = " + n);
        double m = Double.parseDouble("123.456");
        System.out.println("m + 10 = " + (m + 10));
    }
}
