import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kiểu số nguyên
        // byte (1 byte), short (2 byte), int (4 byte), long (8 byte)
        byte age = 18;
        System.out.println("age = " + age);

        // Kiểu số thực
        // float (4 byte), double (8 byte)
        float pif = 3.141555555555F;
        System.out.println("pif = " + pif);
        double pi = 3.1111111111111111555555555D;
        System.out.println("pi = " + pi);

        long a = 5;
        System.out.println("a = " + a);

        // Kiểu logic
        // boolean (1 byte)
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kiểu ký tự
        // char (2 byte)
        char c = 'C';
        System.out.println("c = " + c);

        // Kiểu sâu ký tự
        // String
        String s = "Java core";
        System.out.println("s = " + s);

        // Kiểu thời gian
        // LocalDate, LocalTime, LocalDateTime, Date
        Date d = new Date();
        System.out.println("date = " + d);

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalTime lt = LocalTime.now();
        System.out.println("lt = " + lt);

        LocalDate date = LocalDate.of(2024, 2, 29);
        System.out.println("date = " + date);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        // Kiểu enum
        UIState state = UIState.LOADING;
        UIState state2 = UIState.ERROR;
        System.out.println("state2 = " + state2);
        System.out.println("state = " + state);

        // Kiểu array (mảng)
        int[] numbers = {1, 2, 3, 4, 545};
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.length = " + numbers.length);
        // Chỉ số mảng: bắt đầu từ 0
        System.out.println("numbers[2] = " + numbers[2]);

        String[] f;
        f = new String[]{"Cam", "Quyrt"};
        System.out.println("f.length = " + f.length);
        String[] fruits = new String[]{"Cam", "Mận", "Táo"};
        String[] fruits2;
        fruits2 = new String[]{"abc", "xyz"};
        System.out.println("fruits2 = " + fruits2);

        char[] chars = new char[10];
//        char[] chars2 = new char[-5];
//        System.out.println("chars2.length = " + chars2.length); // java.lang.NegativeArraySizeException

        // Cập nhập giá trị theo chỉ số
        chars[0] = 'K';
        System.out.println("chars[0] = " + chars[0]);
        System.out.println("chars[1] = " + chars[1]);
        System.out.println("characters.length = " + chars.length);
    }
}
