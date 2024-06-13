package exercise.ex2;

public class Question4 {
    public static void main(String[] args) {
        /*
        Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
        dạng như sau:
        Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
        Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
         */
        String fullName = "Nguyễn Văn A";
        String output = String.format("Tên tôi là \"%s\" và tôi đang độc thân", fullName);
        System.out.println(output);
    }
}
