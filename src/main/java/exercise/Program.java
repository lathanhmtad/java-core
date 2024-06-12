package exercise;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Kinh tế";
        System.out.println("department.name = " + department.name);

        Position position = new Position();
        position.id = 1;
        position.name = PositionName.DEV;
        System.out.println("position.name = " + position.name);

        Account account = new Account();
        account.id = 1;
        account.username = "khoa.nv";
        account.email = "khoa@gmail.com";
        account.fullName = "Lê Khoa";
        account.department = department;
        account.position = position;
        account.createdDate = LocalDate.of(2016, 4, 16);
        System.out.println("account.position.name = " + account.position.name);
        System.out.println("account.createdDate = " + account.createdDate);
    }
}
