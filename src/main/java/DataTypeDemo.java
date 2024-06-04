import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kiểu số nguyên
        // byte (1 byte), short (2 byte), int (4 byte), long (8 byte)
        byte age = 18;
        System.out.println("age = " + age);

        // Kiểu số thực
        // float (4 byte), double (8 byte)
        double pi = 3.1111111111111111555555555d;
        System.out.println("pi = " + pi);
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

        // Kiểu thời gian
        // LocalDate, LocalTime, LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate date = LocalDate.of(2019, 3, 19);
        System.out.println("date = " + date);

        // Kiểu enum
        UIState state = UIState.LOADING;
        System.out.println("state = " + state);

        // Kiểu array (mảng)
        int[] numbers = {1,2,3,4,545};
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.length = " + numbers.length);
        // Chỉ số: bắt đầu từ 0
        System.out.println(numbers[2]);

        String[] fruits = new String[] {"Cam", "Mận", "Táo"};
        String[] fruits2;
        fruits2 = new String[]{"abc", "xyz"};
        System.out.println("fruits2 = " + fruits2);

        char[] characters = new char[10];

        characters[0] = 'K';
        System.out.println("characters.length = " + characters.length);
    }
}
