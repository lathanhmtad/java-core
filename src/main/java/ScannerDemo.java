import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào tuổi: ");
        String age = scanner.nextLine();
        System.out.println("Tuổi của bạn là: " + age);

        System.out.println("Mời bạn nhập họ và tên: ");
        String fullName = scanner.nextLine();
        System.out.println("Họ và tên của bạn là: " + fullName);

        System.out.println("Mời bạn nhập vào giới tính: ");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        int menu = scanner.nextInt();
        Gender gender;
        if(menu == 1)
            gender = Gender.MALE;
        else
            gender = Gender.FEMALE;
        System.out.println("Giới tính của bạn là: " + gender);
    }
}
