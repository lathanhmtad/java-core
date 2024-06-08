public class OutputDemo {
    public static void main(String[] args) {
        // Escape characters
        // \" -> "
        // \' -> '
        // \\ -> \
        // \n -> Xuống dòng
        // \t -> Tab

        // System.out.println
        System.out.println("\"Java\" core");
        System.out.println("'Java' core");
        System.out.println("\\Java\\ core");

        // System.out.print
        System.out.print("\tJava core\n");
        System.out.print("Java core");
        System.out.print("Java core\n");

        // System.out.printf
        // %S: Đại diên cho String
        // %d: Đại diện cho số nguyên
        // %f: Đại diện cho số thực
        // %c: Đại diện cho một ký tự
        // %n: Xuống dòng
        System.out.printf("Họ tên: %s, tuổi: %d.%n", "Khoa", 20);
        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %18s |%n", 111, "Khoa");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 2, "Long");
        System.out.println("+----+--------------------+");

        // Gom nhóm, làm tròn
        double money = 12345678321123123123123.789;
        System.out.printf("money = %.2f %n", money);
        System.out.printf("money = %,f %n", money);
        System.out.printf("money = %,.2f", money);

        System.out.println("----");
        System.out.printf("%5.10s", "Hi there!");
    }

}
