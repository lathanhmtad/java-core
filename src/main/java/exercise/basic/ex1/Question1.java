package exercise.basic.ex1;

public class Question1 {
    public static void main(String[] args) {
        /*
        Khai báo 2 số lương có kiểu dữ liệu là float.
        Khởi tạo Lương của Account 1 là 5240.5 $
        Khởi tạo Lương của Account 2 là 10970.055$
        Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
        Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
        */
        float salary1 = 5240.5F;
        float salary2 = 10970.055F;

        int roundedSalary1 = (int) salary1;
        int roundedSalary2 = (int) salary2;

        System.out.println("roundedSalary1 = " + roundedSalary1);
        System.out.println("roundedSalary2 = " + roundedSalary2);
    }
}
