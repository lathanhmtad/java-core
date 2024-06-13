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
        // %s: Đại diên cho String
        // %d: Đại diện cho số nguyên
        // %f: Đại diện cho số thực
        // %c: Đại diện cho một ký tự
        // %n: Xuống dòng
        System.out.printf("Họ tên: %s, tuổi: %d.%n", "Khoa", 20);
        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %18s |%n", 1, "Khoa"); // số dương căn lề phải
        System.out.printf("| %-2d | %-18s |%n", 22, "Long"); // số âm căn lề trái
        System.out.println("+----+--------------------+");

        System.out.println("-----------DDDDDDDD------------");
        System.out.println("-----------DDDDDDDD------------");

        System.out.printf("| %2d | %18s |%n", 111, "Khoa");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 2, "Long");
        System.out.println("+----+--------------------+");

        // Gom nhóm, làm tròn
        double money = 12345678.789567;
        System.out.printf("money = %.2f %n", money);
        System.out.printf("money = %,f %n", money);
        System.out.printf("money = %,.2f %n", money);
        System.out.printf("money = %,d %n", 100000000);
        System.out.printf("money = %s", "Hi");

        System.out.println("\n----");
        System.out.printf("%3.1s", "Hi there!");
    }

}
